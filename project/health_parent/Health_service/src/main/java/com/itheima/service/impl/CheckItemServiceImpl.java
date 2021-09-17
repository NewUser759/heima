package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.dao.CheckItemDao;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.exception.MyException;
import com.itheima.pojo.CheckItem;
import com.itheima.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

@Service
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public List<CheckItem> findAll() {
        return checkItemDao.findAll();
    }

    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }

    @Override
    public PageResult<CheckItem> findPage(QueryPageBean queryPageBean) {
        //判断查询条件是否为空,
        //非空:
        //空: 根据每页数据条数查询

        //使用pageHelper接收当前页和每页数据条数 设置分页参数
        Page<CheckItem> threadLocalPage = PageHelper.startPage(queryPageBean.getCurrentPage(), queryPageBean.getPageSize());

        //非空判断 ==  null != queryPageBean.getQueryString() && queryPageBean.getQueryString().length == 0 ;
        if (!StringUtils.isEmpty(queryPageBean.getQueryString())) {
            //有条件, 模糊拼接
            queryPageBean.setQueryString("%" + queryPageBean.getQueryString() + "%");
        }
        Page<CheckItem> pageInfo = checkItemDao.findPage(queryPageBean.getQueryString());

        System.out.println( "threadLocalPage" + threadLocalPage);
        System.out.println("pageInfo" + pageInfo);
        System.out.println(threadLocalPage == pageInfo);

        long total = pageInfo.getTotal();
        List<CheckItem> result = pageInfo.getResult();

        return new PageResult<CheckItem>(total,result);
    }

    @Override
    public void deleteById(int id) {
        int count = checkItemDao.findCountByCheckItemId(id);
        if (count > 0){
            throw new MyException("该检查项被检查组使用了, 不能删除~");
        }
        checkItemDao.deleteById(id);
    }

    @Override
    public CheckItem findItemById(int id) {
        //调用dao根据id查询检查项
        return checkItemDao.findItemById(id);
    }

    @Override
    public void update(CheckItem checkItem) {
        checkItemDao.update(checkItem);
    }
}
