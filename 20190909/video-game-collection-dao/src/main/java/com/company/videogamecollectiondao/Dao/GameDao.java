package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Game;

import java.util.List;

public interface GameDao {

    Game addGame(Game game);

    Game getGame(int id);

    void updateGame(Game game);

    void deleteGame(int id);

    List<Game> getAllGame();
    List<Game> getGamesByConsole(int console_id);
    List<Game> getGamesByPublisher(int publisher_id);
    List<Game> getGamesByType(int type_id);

}
