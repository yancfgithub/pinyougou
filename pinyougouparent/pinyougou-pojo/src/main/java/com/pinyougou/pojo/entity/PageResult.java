package com.pinyougou.pojo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author yan
 * @create 2021 - 04 - 19 22:54
 */
public class PageResult implements Serializable {
    //记录总条数
    private long total;
    //当前页内容
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
