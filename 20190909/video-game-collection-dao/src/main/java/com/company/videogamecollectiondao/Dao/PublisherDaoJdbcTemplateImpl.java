package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Publisher;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class PublisherDaoJdbcTemplateImpl implements PublisherDao {
    @Override
    @Transactional
    public Publisher addPublisher(Publisher publisher) {
        return null;
    }

    @Override
    public Publisher getPublisher(int id) {
        return null;
    }

    @Override
    public List<Publisher> getAllPublisher() {
        return null;
    }

    @Override
    public void updatePublisher(Publisher publisher) {

    }

    @Override
    public void deletePublisher(int id) {

    }
}
