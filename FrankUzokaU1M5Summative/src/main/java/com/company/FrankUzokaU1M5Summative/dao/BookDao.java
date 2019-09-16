package com.company.FrankUzokaU1M5Summative.dao;

import com.company.FrankUzokaU1M5Summative.model.Author;
import com.company.FrankUzokaU1M5Summative.model.Book;
import com.company.FrankUzokaU1M5Summative.model.Publisher;

import java.util.List;

public interface BookDao {
    Book addBook(Book book);
    Book getBook(int id);
    List<Book> getAllBooks();
    void updateBook(Book book);
    void deleteBook(int id);
    List<Book> getBookByAuthor(int id);



}
