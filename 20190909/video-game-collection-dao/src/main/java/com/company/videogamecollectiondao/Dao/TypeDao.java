package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Type;

import java.util.List;

public interface TypeDao {

    Type addType(Type type);

    Type getType(int id);

    List<Type> getAllType();

    void updateType(Type type);

    void deleteType(int id);
}
