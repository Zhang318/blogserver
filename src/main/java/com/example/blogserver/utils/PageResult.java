package com.example.blogserver.utils;

import java.util.List;

/**
 * @author 张鑫
 * @date 2019/12/23 18:50
 * @description
 */
public class PageResult<T> {
    private Integer total;
    private List<T> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
