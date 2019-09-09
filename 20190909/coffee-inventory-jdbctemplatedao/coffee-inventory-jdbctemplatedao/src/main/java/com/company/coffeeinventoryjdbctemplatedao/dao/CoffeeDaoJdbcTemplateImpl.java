package com.company.coffeeinventoryjdbctemplatedao.dao;

import com.company.coffeeinventoryjdbctemplatedao.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

@Repository
public class CoffeeDaoJdbcTemplateImpl implements CoffeeDao {


    // Prepared statement strings
    private static final String INSERT_COFFEE_SQL =
            "insert into coffee (roaster_id, name, count, unit_price, description, type) values (?, ?, ?, ?, ?, ?)";

    private static final String SELECT_COFFEE_SQL =
            "select * from coffee where coffee_id = ?";

    private static final String SELECT_ALL_COFFEES_SQL =
            "select * from coffee";

    private static final String DELETE_COFFEE_SQL =
            "delete from coffee where coffee_id = ?";

    private static final String UPDATE_COFFEE_SQL =
            "update coffee set roaster_id = ?, name = ?, count = ?, unit_price = ?, description = ?, type = ? where coffee_id = ?";

    private static final String SELECT_COFFEES_BY_ROASTER_SQL =
            "select * from coffee where roaster_id = ?";

    private static final String SELECT_COFFEES_BY_TYPE_SQL =
            "select * from coffee where type = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CoffeeDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Coffee getCoffee(int id) {

        try {

            return jdbcTemplate.queryForObject(SELECT_COFFEE_SQL, this::mapRowToCoffee, id);

        } catch (EmptyResultDataAccessException e) {
            // if nothing is returned just catch the exception and return null
            return null;
        }

    }

    @Override
    public List<Coffee> getAllCoffees() {

        return jdbcTemplate.query(SELECT_ALL_COFFEES_SQL, this::mapRowToCoffee);
    }

    @Override
    public List<Coffee> getCoffeesByRoaster(int roaster_id) {

        return jdbcTemplate.query(SELECT_COFFEES_BY_ROASTER_SQL, this::mapRowToCoffee, roaster_id);
    }

    @Override
    public List<Coffee> getCoffeesByType(String type) {

        return jdbcTemplate.query(SELECT_COFFEES_BY_TYPE_SQL, this::mapRowToCoffee, type);
    }

    @Override
    @Transactional
    public Coffee addCoffee(Coffee coffee) {

        jdbcTemplate.update(INSERT_COFFEE_SQL,
                coffee.getRoaster_id(),
                coffee.getName(),
                coffee.getCount(),
                coffee.getUnit_price(),
                coffee.getDescription(),
                coffee.getType());

        int id = jdbcTemplate.queryForObject("select last_insert_id()", Integer.class);

        coffee.setCoffee_id(id);

        return coffee;
    }

    @Override
    public void updateCoffee(Coffee coffee) {

        jdbcTemplate.update(UPDATE_COFFEE_SQL,
                coffee.getRoaster_id(),
                coffee.getName(),
                coffee.getCount(),
                coffee.getUnit_price(),
                coffee.getDescription(),
                coffee.getType(),
                coffee.getCoffee_id());
    }

    @Override
    public void deleteCoffee(int id) {

        jdbcTemplate.update(DELETE_COFFEE_SQL, id);
    }


    // Helper methods
    private Coffee mapRowToCoffee(ResultSet rs, int rowNum) throws SQLException {
        Coffee coffee = new Coffee();
        coffee.setCoffee_id(rs.getInt("coffee_id"));
        coffee.setRoaster_id(rs.getInt("roaster_id"));
        coffee.setName(rs.getString("name"));
        coffee.setCount(rs.getInt("count"));
        coffee.setUnit_price(rs.getDouble("unit_price"));
        coffee.setDescription(rs.getString("description"));
        coffee.setType(rs.getString("type"));

        return coffee;
    }

}

