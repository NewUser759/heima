package Day04.Test4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 2. 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 *
* */
public class Test {
    public static void main(String[] args) throws ParseException {
            String s = "2018-03-04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");      //创建日期转化对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date p = sdf.parse(s);      //parse解析  调用sdf对象把该格式的字符串转化为初始状态data
        String s1 = sdf2.format(p); //format 格式化    调用sdf对象把data转化成该格式的字符串
        Date d = new Date();
        System.out.println(s1);
        System.out.println(d);
        System.out.println(sdf.parse("2121-7-16"));     //parse 转化为初始格式 解析
        System.out.println(sdf.format(d));      //format 转化为该格式 格式化
    }
}
