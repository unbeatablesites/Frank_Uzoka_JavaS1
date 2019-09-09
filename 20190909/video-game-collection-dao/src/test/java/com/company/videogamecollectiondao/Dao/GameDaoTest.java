package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Console;
import com.company.videogamecollectiondao.Model.Game;
import com.company.videogamecollectiondao.Model.Publisher;
import com.company.videogamecollectiondao.Model.Type;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GameDaoTest {

    @Autowired
    protected GameDao gameDao;
    @Autowired
    protected ConsoleDao consoleDao;
    @Autowired
    protected PublisherDao publisherDao;
    @Autowired
    protected TypeDao typeDao;



    @Before
    public void setUp() throws Exception {
        List<Game> gList = gameDao.getAllGame();
        for (Game g : gList) {
            gameDao.deleteGame(g.getGame_id());
        }

        List<Console> cList = consoleDao.getAllConsole();

        for (Console c : cList) {
            consoleDao.deleteConsole(c.getConsole_id());
        }

        List<Publisher> pList = publisherDao.getAllPublisher();

        for (Publisher p : pList) {
            publisherDao.deletePublisher(p.getPublisher_id());
        }

        List<Type> tList = typeDao.getAllType();

        for (Type t : tList) {
            typeDao.deleteType(t.getType_id());
        }

    }



    @Test
    public void addGetDeleteGame() {

        Game game = new Game();
        game.setGame_id(400);
        game.setConsole_id(400);
        game.setPublisher_id(400);
        game.setType_id(400);

        game = gameDao.addGame(game);

        Game game2 = gameDao.getGame(game.getGame_id());

        assertEquals(game,game2);

        gameDao.deleteGame(game.getGame_id());

        game2 = gameDao.getGame(game.getGame_id());

        assertNull(game2);
    }

    @Test

    public void getAllGames(){

        Game game = new Game();
        game.setGame_id(401);
        game.setConsole_id(401);
        game.setPublisher_id(401);
        game.setType_id(401);

        gameDao.addGame(game);

        game = new Game();
        game.setGame_id(402);
        game.setConsole_id(402);
        game.setPublisher_id(402);
        game.setType_id(402);

        gameDao.addGame(game);

        List<Game> gameList = gameDao.getAllGame();

        assertEquals(2,gameList.size());
    }

    @Test
    public void getGamesByPublisher_id(){

        Game game = new Game();
        game.setGame_id(400);
        game.setConsole_id(400);
        game.setPublisher_id(400);
        game.setType_id(400);

        gameDao.addGame(game);

        game.setGame_id(401);
        game.setConsole_id(401);
        game.setPublisher_id(401);
        game.setType_id(401);

        gameDao.addGame(game);

        game.setGame_id(402);
        game.setConsole_id(402);
        game.setPublisher_id(402);
        game.setType_id(402);

        gameDao.addGame(game);

        List<Game> glist = gameDao.getGamesByPublisher(400);
        assertEquals(1,glist.size());
    }

    @Test

    public void upateIDs(){

        Game game = new Game();
        game.setGame_id(402);
        game.setConsole_id(402);
        game.setPublisher_id(402);
        game.setType_id(402);

        game = gameDao.addGame(game);

        game.setGame_id(500);
        game.setConsole_id(500);
        game.setPublisher_id(500);
        game.setType_id(500);

        gameDao.updateGame(game);

        Game game2 = gameDao.getGame(game.getGame_id());

        assertEquals(game,game2);

    }

}