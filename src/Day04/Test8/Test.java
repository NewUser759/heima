package Day04.Test8;


//6.获取今天是今年的的第几天；

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {

        //创建日历对象
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
