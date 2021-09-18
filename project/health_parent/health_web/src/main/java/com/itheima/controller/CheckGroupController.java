package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckGroup;
import com.itheima.pojo.CheckItem;
import com.itheima.service.CheckGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/checkGroup")
public class CheckGroupController {

    @Autowired
    private CheckGroupService checkGroupService;

    /**
     * 分页查询检查组
     * @param queryPageBean
     * @return
     */
    @RequestMapping("/findGroup")
    public Result findPage(@RequestBody QueryPageBean queryPageBean){
        //调用service , 返回结果
         PageResult<CheckGroup> pageResult  = checkGroupService.findPage(queryPageBean);
         return new Result(true, MessageConstant.QUERY_CHECKGROUP_SUCCESS,pageResult);
    }

    /**
     * 添加检查组
     * 接收检查组信息添加到检查组表格
     * 接收检查项id添加到关系表
     * @return
     */
    @PostMapping("/addGroup")
    //CheckGroup 封装了checkItem集合 里面包含checkItemId ,可是拿不出来用
    //@RequestParam 放在RequestBody前面, 参数名必须和前端?后拼接的单词一致 前端需要用=拼接参数 !!!!!
    public Result addGroup(@RequestParam List<Integer> checkItemIds,@RequestBody CheckGroup checkGroup){

        //调用service
        checkGroupService.addGroup(checkGroup,checkItemIds);
        //返回结果 无data结果参数
        return  new Result(true, MessageConstant.ADD_CHECKGROUP_SUCCESS);
    }

    /**
     * 根据检查组id查询检查组信息
     * @param GroupId
     * @return
     */
    @GetMapping("/{GroupId}")
    public Result getGroup(@PathVariable Integer GroupId){
        CheckGroup group = checkGroupService.getGroup(GroupId);
        return new Result(true, MessageConstant.QUERY_CHECKGROUP_SUCCESS,group);
    }

    /**
     * 通过检查组id获取检查项id
     * @param groupId
     * @return
     */
    @GetMapping("/findCheckItemIdsByCheckGroupId/{groupId}")
    public Result getItemId(@PathVariable Integer groupId){
        List<Integer> ItemIds = checkGroupService.getItemId(groupId);
        return new Result(true, MessageConstant.QUERY_CHECKGROUP_SUCCESS,ItemIds);
    }

    /**
     * 更新检查组
     * @param checkGroup
     * @param checkitemIds
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody CheckGroup checkGroup, @RequestParam List<Integer> checkitemIds){
        checkGroupService.update(checkGroup, checkitemIds);
        return new Result(true, MessageConstant.EDIT_CHECKGROUP_SUCCESS);
    }

    /**
     * 删除检查组
     * @param groupId
     * @return
     */
    @DeleteMapping("{groupId}")
    public Result delete(@PathVariable Integer groupId){
        checkGroupService.delete(groupId);
        return new Result(true, MessageConstant.EDIT_CHECKGROUP_SUCCESS);
    }
}
