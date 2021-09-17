package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;

import java.util.List;

public interface CheckItemDao {

    List<CheckItem> findAll();

    void add(CheckItem checkItem);

    Page<CheckItem> findPage(String queryString);

    int findCountByCheckItemId(int id);

    void deleteById(int id);

    /**
     * 通过id查找检查项信息
     * @param id
     * @return
     */
    CheckItem findItemById(int id);

    /**
     * 修改检查项
     * @param checkItem
     */
    void update(CheckItem checkItem);
}
