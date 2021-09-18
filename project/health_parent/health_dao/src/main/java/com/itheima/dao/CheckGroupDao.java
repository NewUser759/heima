package com.itheima.dao;

import com.itheima.pojo.CheckGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckGroupDao {

    /**
     * 分页查询的方法
     * @return
     * @param queryString
     */
    List<CheckGroup> findPage(String queryString);

    /**
     * 为检查组表格增加检查组信息
     * @param checkGroup
     */
    void addGroup(CheckGroup checkGroup);

    /**
     * 为检查组和检查项关系表增加关系
     */
    //多个参数类型且参数类型相同时要取别名 使用@Param
    void addGroupItem(@Param("groupId") Integer groupId, @Param("itemId")Integer itemId);

    /**
     * 通过检查组id获取检查组信息
     * @param groupId
     * @return
     */
    CheckGroup getGroup(Integer groupId);

    /**
     * 通过检查组id获取检查项id
     * @param groupId
     * @return
     */
    List<Integer> getItemId(Integer groupId);

    /**
     * 跟新
     * @param checkGroup
     */
    void update(CheckGroup checkGroup);

    /**
     * 删除关系表关系
     * @param checkGroupId
     */
    void deleteCheckGroupCheckItem(Integer checkGroupId);

    /**
     * 删除检查组
     * @param checkGroupId
     */
    void deleteCheckGroup(Integer checkGroupId);
}
