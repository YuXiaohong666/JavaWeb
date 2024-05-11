package com.geo.test;

import com.geo.dao.BookDao;
import com.geo.dao.impl.BookDaoImpl;
import com.geo.pojo.Book;
import com.geo.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null, "海底两万里", "李晓杰", new BigDecimal(23), 400, 20, null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(1);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(2, "海底两万里", "李晓杰", new BigDecimal(23), 800, 20, null), 2);
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(3));
    }

    @Test
    public void queryAllBook() {
        System.out.println(bookDao.queryAllBook());
    }

    //    打印出三条记录
    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {
        for (Book book : bookDao.queryForPageItems(0, Page.PAGE_SIZE)) {
            System.out.println(book);
        }
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println(bookDao.queryForPageTotalCountByPrice(10, 50));
    }

    @Test
    public void queryForPageItemsByPrice() {
        System.out.println(bookDao.queryForPageItemsByPrice(0, Page.PAGE_SIZE, 10, 50));
    }
}