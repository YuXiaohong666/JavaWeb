package com.geo.pojo;

import java.math.BigDecimal;

/**
 * @author yuxiaohong
 * @package com.geo.pojo
 * @date 2023/3/21 9:42
 * @description
 */
public class Book {
    private String sn;
    private String name;
    private BigDecimal price;
    private String author;


    public Book(String sn, String name, BigDecimal price, String author) {
        this.sn = sn;
        this.name = name;
        this.price = price;
        this.author = author;
    }


    public Book() {
    }
    //    使用alt+insert快速生成get和set方法
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//   使用alt+ins创建toString
    @Override
    public String toString() {
        return "Book{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
