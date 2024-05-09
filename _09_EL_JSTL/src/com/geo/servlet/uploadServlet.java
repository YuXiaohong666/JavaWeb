package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2024/1/25 10:52
 * @description 处理文件上传
 */
public class uploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("文件上传过来了" + req.getInputStream());
////        因为是以流的方式上传过来的，所以需要以流的方式去接收
//        ServletInputStream inputStream = req.getInputStream();
//        byte[] buffer = new byte[1024];
//        int read = inputStream.read(buffer);
//        System.out.println(new String(buffer, 0, read));
        if (ServletFileUpload.isMultipartContent((javax.servlet.http.HttpServletRequest) req)) {
            //创建FileItemFactory工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
//            用于解析上传数据的工具类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
//            调用解析方法，解析上传的数据，得到每一个表单项fileItem
            try {
                List<FileItem> list = servletFileUpload.parseRequest((javax.servlet.http.HttpServletRequest) req);
//                循环判断，每一个表单项是普通类型还是上传的文件
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()) {
//                        普通表单项
                        System.out.println("表单项的name属性值是：" + fileItem.getFieldName());
//                        参数UTF-8解决乱码问题
                        System.out.println("表单项的value属性值：" + fileItem.getString("UTF-8"));
                    } else {
//                        上传的文件
                        //                        普通表单项
                        System.out.println("表单项的name属性值是：" + fileItem.getFieldName());
//                        参数UTF-8解决乱码问题
                        System.out.println("上传的文件名：" + fileItem.getName());

                        fileItem.write(new File("d:\\" + fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("文件上传过来了" + req.getParameter("username"));
    }
}
