package com.geo.service;

import com.geo.pojo.Book;
import com.geo.pojo.Page;

import java.util.List;

public interface BookService {
    public void addBook(Book book);

    public void deleteBook(Integer id);

    public void updateBook(Book book, Integer id);

    public Book queryBook(Integer id);

    public List<Book> queryBooks();

    public Page<Book> page(int pageNo, int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}
