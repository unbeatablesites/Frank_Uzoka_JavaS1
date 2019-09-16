package com.company.FrankUzokaU1M5Summative.dao;

import com.company.FrankUzokaU1M5Summative.model.Author;
import com.company.FrankUzokaU1M5Summative.model.Publisher;

import java.util.List;

public interface AuthorDao {
    Author addAuthor(Author author);
    Author getAuthor(int id);
    List<Author> getAllAuthor();
    void updateAuthor(Author author);
    void deleteAuthor(int id);
}
