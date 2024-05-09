package com.geo.dao;

import com.geo.pojo.Book;

import java.util.List;

public interface BookDao {
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book, Integer id);

    public Book queryBookById(Integer id);

    public List<Book> queryAllBook();

    public Integer queryForPageTotalCount();

    List<Book> queryForPageItems(int begin, int pageSize);
}
