package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Type;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class TypeDaoJdbcTemplateImpl implements TypeDao{

@Override
@Transactional
    public Type addType(Type type) {
        return null;
    }

    @Override
    public Type getType(int id) {
        return null;
    }

    @Override
    public List<Type> getAllType() {
        return null;
    }

    @Override
    public void updateType(Type type) {

    }

    @Override
    public void deleteType(int id) {

    }
}
