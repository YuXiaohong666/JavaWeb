package com.geo.web;

import com.geo.pojo.Book;
import com.geo.pojo.Page;
import com.geo.service.BookService;
import com.geo.service.impl.BookServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet(name = "ClientBookServlet", value = "/client/bookServlet")
public class ClientBookServlet extends BaseServlet {
    private BookService bookService = new BookServiceImpl();

    //    处理分页功能
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
        System.out.println("经过了前台的ClientBookServlet程序");
        //        1.获取请求的参数pageNo和pageSize
        int pageNo = req.getParameter("pageNo") != null ? Integer.parseInt(req.getParameter("pageNo")) : 1;
        int pageSize = req.getParameter("pageSize") != null ? Integer.parseInt(req.getParameter("pageSize")) : Page.PAGE_SIZE;
//        2.调用BookService.page方法转成page对象
        Page<Book> page = bookService.page(pageNo, pageSize);
//        3.保存page对象到request域中
        req.setAttribute("page", page);
//        4.请求转发到book_manager.jsp页面
        System.out.println(req.getAttribute("page"));
        req.getRequestDispatcher("/pages/client/index.jsp").forward(req, resp);
    }

    //    处理价格区间的图书分页
    protected void pageByPrice(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
        System.out.println("经过了前台的ClientBookServlet程序");
        //        1.获取请求的参数pageNo和pageSize
        int pageNo = req.getParameter("pageNo") != null ? Integer.parseInt(req.getParameter("pageNo")) : 1;
        int pageSize = req.getParameter("pageSize") != null ? Integer.parseInt(req.getParameter("pageSize")) : Page.PAGE_SIZE;
        int min = req.getParameter("min") != null ? Integer.parseInt(req.getParameter("min")) : 0;
        int max = req.getParameter("max") != null ? Integer.parseInt(req.getParameter("max")) : Integer.MAX_VALUE;
//        2.调用BookService.page方法转成page对象
        Page<Book> page = bookService.pageByPrice(pageNo, pageSize, min, max);
//        3.保存page对象到request域中
        req.setAttribute("page", page);
//        4.请求转发到book_manager.jsp页面
        req.getRequestDispatcher("/pages/client/index.jsp").forward(req, resp);
    }
}
