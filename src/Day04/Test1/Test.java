package Day04.Test1;

import java.text.SimpleDateFormat;
import java.util.Date;


/*
* 1. 请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
*
* */


public class Test {
    public static void main(String[] args) {
        Date date = new Date();     //获取当前时间

        //创建当前时间转换格式的对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        //把当前时间转化为字符串形式并输出          Data --format -->String
        System.out.println(sdf.format(date));


    }
}
