package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import com.itheima.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Autowired
    private CheckItemService checkItemService;


    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll(){

        List<CheckItem> list = checkItemService.findAll();

        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,list);
    }

    /**
     * 增加检查项
     * @param checkItem
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){
        checkItemService.add(checkItem);

        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);

    }

    /**
     * 分页查询检查项
     * @param queryPageBean
     * @return
     */
    @PostMapping("/findPage")
    public Result findPage(@RequestBody QueryPageBean queryPageBean){

        //接收参数,调用service
        PageResult<CheckItem> pageResult= checkItemService.findPage(queryPageBean);
        //返回结果
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,pageResult);
    }


    /**
     * 删除检查项
     * @param id
     * @return
     */
    // DeleteMapping restful写法, 获取get请求的路径中的参数
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable int id){
        checkItemService.deleteById(id);
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }

    /**
     * 根据检查项id查询检查项
     * @param id
     * @return
     */
    //GetMapping restful写法, 获取get请求的路径中的参数,并用于查找
    @GetMapping("/{id}")
    public Result findItemById(@PathVariable int id){
        CheckItem checkItem = checkItemService.findItemById(id);
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,checkItem);
    }

    /**
     * 跟新检查项
     * @param id
     * @param checkItem
     * @return
     */
    @PutMapping("/{id}")
    public Result Update(@PathVariable int id, @RequestBody CheckItem checkItem){
        //调用 , 返回
        checkItemService.update(checkItem);
        return new Result(true, MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }

}
