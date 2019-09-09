package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Console;

import java.util.List;

public interface ConsoleDao {

    Console addConsole( Console label);

    Console getConsole(int id);

    List< Console> getAllConsole();

    void updateConsole(Console label);

    void deleteConsole(int id);

}
