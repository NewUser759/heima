package Day07.Test4;

/*
* 需求：双色球规则，双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
* 红色球号码从1—33中选择，红球不可重复；蓝色球号码从1—16中选择。请随机生成一注双色球号码。
 *
 *
 *注意 ： 6个红球号码不可重复
 * 完成
* */

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //使用循环把1-33添加进集合中，因为循环， 集合中元素不会重复
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 34; i++) {
            list.add(i);
        }
        //Collections 工具类 打乱集合排序方法
        Collections.shuffle(list);
        //取前6个数， 使用集合内subList方法  --> 红球
        List<Integer> red = list.subList(0, 6);
        System.out.println("红球：" + red);


        //随机数生成蓝球
        Random r = new Random();
        int blue = r.nextInt(16) + 1;
        System.out.println("蓝球：" + blue);

    }
}
