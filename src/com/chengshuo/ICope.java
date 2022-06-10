package com.chengshuo;

import java.util.List;

public interface ICope<T> {
    //书籍（添加、查询、购买），管理员（添加、查询）
    void add(T t);
    void buy();
    List<T> query();
}
