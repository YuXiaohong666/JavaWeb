package com.geo.service.impl;

import com.geo.dao.BookDao;
import com.geo.dao.impl.BookDaoImpl;
import com.geo.pojo.Book;
import com.geo.pojo.Page;
import com.geo.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max) {
        Page<Book> page = new Page<Book>();
//        求总记录数
        Integer pageTotalCount = bookDao.queryForPageTotalCountByPrice(min, max);
//        设置总记录数
        page.setPageTotalCount(pageTotalCount);
//        求总页码
        int pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
//        设置总页码
        page.setPageTotal(pageTotal);
//        数据边界的有效性检查
        if (pageNo < 1) {
            pageNo = 1;
        }
        if (pageNo > pageTotal) {
            pageNo = pageTotal;
        }
//        设置当前页码
        page.setPageNo(pageNo);
//        求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
//        求当前页数据
        List<Book> items = bookDao.queryForPageItemsByPrice(begin, pageSize, min, max);
//        设置当前页面数据
        page.setItems(items);

        return page;
    }

    @Override
    public void deleteBook(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book, Integer id) {
        bookDao.updateBook(book, id);
    }

    @Override
    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> page = new Page<Book>();
//        求总记录数
        Integer pageTotalCount = bookDao.queryForPageTotalCount();
//        设置总记录数
        page.setPageTotalCount(pageTotalCount);
//        求总页码
        int pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
//        设置总页码
        page.setPageTotal(pageTotal);
//        数据边界的有效性检查
        if (pageNo < 1) {
            pageNo = 1;
        }
        if (pageNo > pageTotal) {
            pageNo = pageTotal;
        }
//        设置当前页码
        page.setPageNo(pageNo);
//        求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
//        求当前页数据
        List<Book> items = bookDao.queryForPageItems(begin, pageSize);
//        设置当前页面数据
        page.setItems(items);

        return page;
    }
    

    @Override
    public Book queryBook(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryAllBook();
    }
}
