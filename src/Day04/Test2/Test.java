package Day04.Test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//format 格式化
//parse 解析

public class Test {
    public static void main(String[] args) {
        //获取系统当前时间  -->太平洋时间格式
        Date date = new Date();
        System.out.println(date);

        //更改时间格式(日期格式化)： 1. 创建SimpleDataFormat对象，使用字符串形式提供时间格式模板
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        //HH 为24小时制，hh为12小时制
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");

        //更改时间格式： 2. 调用format方法更改时间格式
        System.out.println(sdf1.format(date));
        String time = sdf2.format(date);        // format() 反回值为String 类型
        System.out.println(time);


        //如果提供一个字符串的日期时间要返回data格式
        //举例： 2021年7月15日 16时20分29秒


        String time1 = "2020年06月18日 14时24分38秒";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");  //   提供原日期模板
           Date time2 = null;       //先赋值null
        try {
            time2 = sdf3.parse(time1);  //parse为解析日期格式 返回初始格式 有时候会报异常 使用异常抛出
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(time2);

    }

}
