package Day04.Test5;


import java.util.Calendar;

/*
* 用程序判断2018年2月14日是星期几
* */
public class Test {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cal = Calendar.getInstance();
        cal.set(2018, 2, 14);
        int dayOfweek = cal.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.print("星期" + dayOfweek);
    }

}
