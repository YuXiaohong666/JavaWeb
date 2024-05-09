package com.geo.web;

import com.geo.pojo.Book;
import com.geo.pojo.Page;
import com.geo.service.BookService;
import com.geo.service.impl.BookServiceImpl;
import com.oracle.wls.shaded.org.apache.bcel.generic.SWAP;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(name = "bookServlet", value = "/manager/bookServlet")
public class BookServlet extends BaseServlet {
    private BookService bookService = new BookServiceImpl();

    //    处理分页功能
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
//        1.获取请求的参数pageNo和pageSize
        int pageNo = req.getParameter("pageNo") != null ? Integer.parseInt(req.getParameter("pageNo")) : 1;
        int pageSize = req.getParameter("pageSize") != null ? Integer.parseInt(req.getParameter("pageSize")) : Page.PAGE_SIZE;
//        2.调用BookService.page方法转成page对象
        Page<Book> page = bookService.page(pageNo, pageSize);
//        3.保存page对象到request域中
        req.setAttribute("page", page);
//        4.请求转发到book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
    }


    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
//        接受的页数加一，防止新加的溢出到下一页
        int pageNo = Integer.parseInt(req.getParameter("pageNo")) + 1;
        //        获取请求的参数，封装为book对象
        String name = req.getParameter("name");
        String author = req.getParameter("author");
        BigDecimal price = new BigDecimal(req.getParameter("price"));
        Integer sales = Integer.valueOf(req.getParameter("sales"));
        Integer stock = Integer.valueOf(req.getParameter("stock"));
        Book book = new Book(null, name, author, price, sales, stock, null);
//        调用BookService.addBook保存图书
        bookService.addBook(book);
//        跳转到图书列表页面
//        req.getRequestDispatcher("/manager/bookServlet?action=list").forward(req, resp);
//        使用请求转发会导致重复提交的bug，所以使用重定向，但是重定向是路径是基于端口号的，所以前面要加上工程名
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + pageNo);
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求的图书id
        String id = req.getParameter("id");
//        调用BookService.delete方法，删除图书
        bookService.deleteBook(Integer.valueOf(id));
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + req.getParameter("pageNo"));
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        //        获取请求的参数，封装为book对象
        String name = req.getParameter("name");
        String author = req.getParameter("author");
        BigDecimal price = new BigDecimal(req.getParameter("price"));
        Integer sales = Integer.valueOf(req.getParameter("sales"));
        Integer stock = Integer.valueOf(req.getParameter("stock"));
        Book book = new Book(null, name, author, price, sales, stock, null);
        bookService.updateBook(book, Integer.valueOf(id));
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + req.getParameter("pageNo"));
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.通过BookService查询全部图书
        List<Book> books = bookService.queryBooks();
//        2.把全部图书保存到request域中
        req.setAttribute("books", books);
//        3。请求转发到/pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
    }

    //    获取图书信息，用于修改图书页面的图书信息显示
    protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Book book = bookService.queryBook(id);
        req.setAttribute("book", book);
        req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req, resp);
    }
}
