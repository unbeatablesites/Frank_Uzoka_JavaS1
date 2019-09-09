package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class GameDaoJdbcTemplateImpl implements GameDao {


    private static final String INSERT_GAME_SQL =
            "INSERT INTO GAME (CONSOLE_ID,PUBLISHER_ID,TYPE_ID)VALUES(?,?,?)";

    private static final String  SELECT_GAME_SQL=
            "select * from game where id = ?";

    private static final String  SELECT_ALL_GAME_SQL=
            "select * from game";

    private static final String  DELETE_GAME_SQL=
            "delete from game where id = ?";

    private static final String  UPDATE_GAME_SQL=
            "update game set console_id = ?, publisher_id = ?,type_id = ? where id =?";

    private static final String  SELECT_GAMES_BY_ID_SQL=
            "select * from game where publisher_id = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public GameDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public Game addGame(Game game) {
        jdbcTemplate.update(INSERT_GAME_SQL,
                game.getConsole_id(),
                game.getPublisher_id(),
                game.getType_id());
        int Game_id = jdbcTemplate.queryForObject("select last_insert_Game_id()",Integer.class);

            game.setGame_id(Game_id);
            return game;
    }

    @Override
    public Game getGame(int id) {
//        get one Game
        try {
            return jdbcTemplate.queryForObject(SELECT_GAME_SQL, this::mapRowToGame, id);
        }catch (EmptyResultDataAccessException e){
            return null;
        }

    }

    @Override
    public void updateGame(Game game) {

        jdbcTemplate.update(UPDATE_GAME_SQL,
                game.getConsole_id(),
                game.getPublisher_id(),
                game.getType_id(),
                game.getGame_id());

    }

    @Override
    public void deleteGame(int id) {

        jdbcTemplate.update(DELETE_GAME_SQL, id);

    }

    @Override
    public List<Game> getAllGame() {


        return jdbcTemplate.query(SELECT_ALL_GAME_SQL, this::mapRowToGame);
    }

    @Override
    public List<Game> getGamesByConsole(int console_id) {
        return null;
    }

    @Override
    public List<Game> getGamesByPublisher(int publisher_id) {
        return jdbcTemplate.query(SELECT_GAMES_BY_ID_SQL, this::mapRowToGame,publisher_id);
    }

    @Override
    public List<Game> getGamesByType(int type_id) {
        return null;
    }

    private Game mapRowToGame(ResultSet rs,int rowNum) throws SQLException{
        Game game = new Game();
        game.setGame_id(rs.getInt("game_id"));
        game.setGame_id(rs.getInt("console_id"));
        game.setGame_id(rs.getInt("publisher_id"));
        game.setGame_id(rs.getInt("type_id"));

        return game;

    }
}
