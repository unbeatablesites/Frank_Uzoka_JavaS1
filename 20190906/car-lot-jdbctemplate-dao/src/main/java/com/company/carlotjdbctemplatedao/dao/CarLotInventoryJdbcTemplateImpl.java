package com.company.carlotjdbctemplatedao.dao;

import com.company.carlotjdbctemplatedao.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

@Repository
class CarLotInventoryJdbcTemplateImpl implements CarInventoryDao {

    // Prepared statement strings
    private static final String INSERT_CAR_SQL =
            "insert into car (make, model, year, color) values (?, ?, ?, ?)";

    private static final String SELECT_CAR_SQL =
            "select * from car where id = ?";

    private static final String SELECT_ALL_CAR_SQL =
            "select * from car";

    private static final String DELETE_CAR_SQL =
            "delete from car where id = ?";

    private static final String UPDATE_CAR_SQL =
            "update car set make = ?, model = ?, year = ?, color = ? where id = ?";

    private static final String SELECT_CAR_BY_MAKE_SQL =
            "select * from car where make = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CarLotInventoryJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Car getCar(int id) {

        try {

            return jdbcTemplate.queryForObject(SELECT_CAR_SQL, this::mapRowToCar, id);

        } catch (EmptyResultDataAccessException e) {
            // if nothing is returned just catch the exception and return null
            return null;
        }

    }

    @Override
    public List<Car> getAllCars() {
        return jdbcTemplate.query(SELECT_ALL_CAR_SQL, this::mapRowToCar);
    }

    @Override
    @Transactional
    public Car addCar(Car car) {
        jdbcTemplate.update(INSERT_CAR_SQL,
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car.getColor());

        int id = jdbcTemplate.queryForObject("select last_insert_id()", Integer.class);

        car.setId(id);

        return car;
    }

    @Override
    public void updateCar(Car car) {
            jdbcTemplate.update(UPDATE_CAR_SQL,
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car.getColor(),
                car.getId());
    }

    @Override
    public void deleteCar(int id) {
        jdbcTemplate.update(DELETE_CAR_SQL, id);
    }

    @Override
    public List<Car> getCarByMake(String make) {
        return jdbcTemplate.query(SELECT_CAR_BY_MAKE_SQL, this::mapRowToCar, make);
    }

    // Helper methods maps motorcycle to motorcycle row
    private Car mapRowToCar(ResultSet rs, int rowNum) throws SQLException {
        Car carMap = new Car();

        carMap.setId(rs.getInt("id"));
        carMap.setMake(rs.getString("make"));
        carMap.setModel(rs.getString("model"));
        carMap.setYear(rs.getString("year"));
        carMap.setColor(rs.getString("color"));

        return carMap;
    }
}
