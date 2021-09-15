package Day07.Test6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
*
* 需求：研发部门有5个人，信息如下：（姓名-工资）
* 【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800】,
* 将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台。
操作步骤描述：
1. 定义HashMap,姓名作为key,工资作为value
2. 使用put方法添加需要的元素
3. 获取到柳岩的工资
4. 修改柳岩的工资为当前工资加上300
5. 使用增强for+keySet迭代出每个员工的工资
* */
public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);

        System.out.println(map);


        Integer s = map.get("柳岩");
        map.put("柳岩",s+300);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);

            System.out.println(key +"="+ value);
        }







    }
}
