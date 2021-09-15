package Day04.Test7;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 5.有2个字符串形式的日期数据，计算它们相距多少天？
 		"2014年09/28 23时13分01秒"
 		"2009-02月12日 12时02分01秒"
* */
public class Test {
    public static void main(String[] args) throws ParseException {

        String t1 = "2014年09/28 23时13分01秒";
        String t2 = "2009-02月12日 12时02分01秒";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM月dd日");

        Date d1 = sdf1.parse(t1);
        Date d2 = sdf2.parse(t2);
        System.out.println(d1);
        System.out.println(d2);
        long t3 = d1.getTime();
        long t4 = d2.getTime();
            long t = t3 -t4;
            int days = (int)(t / (1000 * 60 * 60 * 24));
       // System.out.println(t3);
       // System.out.println(t4);
       // System.out.println(t);
        System.out.println(days);


    }
}
