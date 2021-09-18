package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.dao.CheckGroupDao;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckGroup;
import com.itheima.pojo.CheckItem;
import com.itheima.service.CheckGroupService;
import com.qiniu.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class CheckGroupServiceImpl implements CheckGroupService {

    /**
     * 注入dao
     */
    @Autowired
    private CheckGroupDao checkGroupDao;

    /**
     * 实现service接口,分页查询检查组
     *
     * @param queryPageBean
     * @return
     */
    @Override
    public PageResult<CheckGroup> findPage(QueryPageBean queryPageBean) {
        //调用分页查询工具类 PageHelper
        Page<CheckGroup> pageInfo = PageHelper.startPage(queryPageBean.getCurrentPage(), queryPageBean.getPageSize());
        //检查有无查询信息
        //如果空 或者null就进去
        if (!StringUtils.isNullOrEmpty(queryPageBean.getQueryString())) {
            //有 -> 拼接信息, 模糊查询
            queryPageBean.setQueryString("%" + queryPageBean.getQueryString() + "%");
        }
        //调用dao查询, 查询所有结果, 无参, 返回值: List<CheckGroup> rows 集合 -> 数据集
        //注意: 有条件的情况!!!!  所以这里要加参数 queryPageBean.getQueryString()
        List<CheckGroup> rows = checkGroupDao.findPage(queryPageBean.getQueryString());
        //使用pageHelper计算数据总数  参数: 无参 , 返回值: long total
        long total = pageInfo.getTotal();
        //封装数据集, 返回结果
        return new PageResult<CheckGroup>(total, rows);
    }


    /**
     * 增加检查组
     *
     * @param checkGroup
     * @param checkItemIds
     */
    @Override
    @Transactional
    public void addGroup(CheckGroup checkGroup, List<Integer> checkItemIds) {
        //2个表同时增加数据 使用事务 @transactional
        //调用dao 为检查组表格增加数据
        checkGroupDao.addGroup(checkGroup);

        //获取检查组id
        Integer groupId = checkGroup.getId();

        //非空判断 ->
        // 如果传进来的checkGroup中包含的checkItemId不为空 则遍历获取checkItemId并进行添加
        // 如果checkItemId为空则不需要下面的操作
        if (Objects.nonNull(checkItemIds)) {
            //获取检查项id
            for (Integer checkitemId : checkItemIds) {
                //调用dao 为关系表增加检查项id
                checkGroupDao.addGroupItem(groupId, checkitemId);
            }
        }
    }

    @Override
    public CheckGroup getGroup(Integer groupId) {
        return checkGroupDao.getGroup(groupId);
    }

    /**
     * 通过检查组id获得检查项id
     * @param groupId
     * @return
     */
    @Override
    public List<Integer> getItemId(Integer groupId) {
        return checkGroupDao.getItemId(groupId);
    }

    /**
     * 跟新
     * @param checkGroup
     * @param checkitemIds
     */
    @Override
    @Transactional
    public void update(CheckGroup checkGroup, List<Integer> checkitemIds) {
        //跟新检查组表格
        checkGroupDao.update(checkGroup);
        //2. 获取检查组id
        Integer checkGroupId = checkGroup.getId();
        //3. 先删除旧关系 根据检查组id删除关系表中所有的对应的检查项
        checkGroupDao.deleteCheckGroupCheckItem(checkGroupId);
        //4. 遍历选中的检查项id数组，空判断
        if(null != checkitemIds) {
            for (Integer checkitemId : checkitemIds) {
                //5. 添加检查组与检查项的新关系
                checkGroupDao.addGroupItem(checkGroupId, checkitemId);
            }
        }
    }

    @Override
    @Transactional
    public void delete(Integer checkGroupId) {
        //根据检查组id获取相关的检查项id ,删除
        checkGroupDao.deleteCheckGroupCheckItem(checkGroupId);
        //删除检查组表格的数据
        checkGroupDao.deleteCheckGroup(checkGroupId);
    }
}
