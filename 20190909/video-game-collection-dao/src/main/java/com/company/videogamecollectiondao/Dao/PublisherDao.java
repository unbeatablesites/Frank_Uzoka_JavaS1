package com.company.videogamecollectiondao.Dao;

import com.company.videogamecollectiondao.Model.Publisher;

import java.util.List;

public interface PublisherDao {

    Publisher addPublisher(Publisher publisher);

    Publisher getPublisher(int id);

    List<Publisher> getAllPublisher();

    void updatePublisher(Publisher publisher);

    void deletePublisher(int id);

}
