package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckGroup;

import java.util.List;

public interface CheckGroupService {

    /**
     * 分页查询检查组的方法
     * @param queryPageBean
     * @return
     */
    PageResult<CheckGroup> findPage(QueryPageBean queryPageBean);

    /**
     * 添加查询组的方法
     * @param checkGroup
     * @param checkItemIds
     */
    void addGroup(CheckGroup checkGroup, List<Integer> checkItemIds);

    /**
     * 通过检查组id获取检查组信息
     * @param groupId
     * @return
     */
    CheckGroup getGroup(Integer groupId);

    /**
     *通过检查组id获得检查项id
     * @param groupId
     * @return
     */
    List<Integer> getItemId(Integer groupId);

    void update(CheckGroup checkGroup, List<Integer> checkitemIds);

    void delete(Integer groupId);
}
