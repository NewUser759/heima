package Day04.Test9;

/*
* 代码计算500天后是几几年几月几日
* */

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        c.add(Calendar.DATE,500);

        int year =  c.get(Calendar.YEAR);
        int month =  c.get(Calendar.MONTH) +1;
        int day = c.get(Calendar.DAY_OF_MONTH);



        System.out.println(c);
        System.out.println(time);

        System.out.println("500天后：" + year+ "年" + month + "月" +day +"日");

    }
}
