package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Console;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class ConsoleDaoJdbcTemplateImpl implements ConsoleDao {
    @Override
    @Transactional
    public Console addConsole(Console label) {
        return null;
    }

    @Override
    public Console getConsole(int id) {
        return null;
    }

    @Override
    public List<Console> getAllConsole() {
        return null;
    }

    @Override
    public void updateConsole(Console label) {

    }

    @Override
    public void deleteConsole(int id) {

    }
}
