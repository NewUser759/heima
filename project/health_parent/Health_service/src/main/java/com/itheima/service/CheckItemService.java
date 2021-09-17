package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CheckItemService {

    /**
     * 查询所有数据的方法
     * @return
     */
    List<CheckItem> findAll();

    void add(CheckItem checkItem);

    PageResult<CheckItem> findPage(QueryPageBean queryPageBean);


    void deleteById(int id);


    CheckItem findItemById(int id);

    void update(CheckItem checkItem);
}
