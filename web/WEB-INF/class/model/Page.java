package model;

import java.util.List;

public class Page {
    private int pageNumber;
    private int pageSize;
    private int totalCount;
    private int totalPage;
    private double totalAmount;  // 新增字段
    private List<Object> list;
    private List<sellhuo> sellhuoList;
    public double getTotalAmount() {
        return totalAmount;
    }
    // Getter 和 Setter
    public List<sellhuo> getSellhuoList() {
        return sellhuoList;
    }

    public void setSellhuoList(List<sellhuo> list) {
        this.sellhuoList= list;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void SetPageSizeAndTotalCount(int pageSize,int totalCount)
    {
        this.pageSize=pageSize;
        this.totalCount=totalCount;
        totalPage= (int)Math.ceil((double)totalCount/pageSize);
    }
    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
