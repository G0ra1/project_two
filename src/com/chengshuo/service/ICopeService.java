package com.chengshuo.service;

import com.chengshuo.ICope;

import java.util.ArrayList;
import java.util.List;

public class ICopeService<T> implements ICope<T> {
    // 代表数据库
    private  List<T> list = new ArrayList();
    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void buy() {

    }

    @Override
    public List<T> query() {
        return list;
    }
}
