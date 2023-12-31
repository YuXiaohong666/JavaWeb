package com.geo.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yuxiaohong
 * @package com.geo.pojo
 * @date 2023/3/21 10:18
 * @description
 */
public class Dom4jTest {
    @Test
    public void test1() throws Exception {
//        创建一个SaxReader输入流，去读取xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("D:\\IDEA_Workspace\\JavaWeb\\_05-xml\\xml\\books.xml");

        System.out.println(document);
    }


//    读取books.xml文件生成Book类
    @Test
    public void test2() throws DocumentException {
//        1.读取books.xml文件
        SAXReader reader =  new SAXReader();
//        在Junit测试中，相对路径是从模块名开始算
        Document document = reader.read("src/books.xml");
//        2.通过Document对象获取根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
//        3.通过根元素获取book标签对象
//        element()和elements()都是通过标签名查找子元素
        List<Element> books = rootElement.elements("book");
//        4.遍历，处理每个book标签转换为Book类
        for (Element book : books){
//            axXML()是把标签对象转换为标签字符串
            Element nameElement = book.element("name");
//            getText()方法可以获取标签中的文本内容
            String nameText = nameElement.getText();

            String priceText = book.elementText("price");
            String authorText = book.elementText("author");
            String snValue = book.attributeValue("sn");
            System.out.println(new Book(snValue,nameText, BigDecimal.valueOf(Double.parseDouble(priceText)),authorText));
        }
    }
}
