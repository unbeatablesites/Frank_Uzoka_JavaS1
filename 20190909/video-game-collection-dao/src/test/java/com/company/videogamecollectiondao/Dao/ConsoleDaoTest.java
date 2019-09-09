package com.company.videogamecollectiondao.Dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConsoleDaoTest {

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
    }

    @Test
    public void getConsole() {
    }
}