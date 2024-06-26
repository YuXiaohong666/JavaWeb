package com.geo.pojo;

import java.util.List;

public class Page<T> {
    public static final Integer PAGE_SIZE = 4;
    //    当前页码
    private Integer pageNo;
    //    当前页显示数量
    private Integer pageSize = PAGE_SIZE;
    //    总页数
    private Integer pageTotal;
    //    总记录数
    private Integer pageTotalCount;
    //    当前页数据
    private List<T> items;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", pageTotal=" + pageTotal +
                ", pageTotalCount=" + pageTotalCount +
                ", items=" + items +
                '}';
    }
}
