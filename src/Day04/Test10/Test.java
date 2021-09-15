package Day04.Test10;

/*
*
* String[] nums = {“3.22”,”8.1”,”7”,”2.5”,”3.1”,”7.77”,”8.0”,”9.21”};

请编程计算它们的平均值，结果精确到小数点后两位。
* */

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.777","8.0","9.21"};
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Double.valueOf(nums[i]);
        }
        System.out.println(sum / nums.length);
        System.out.println(String.format("%.2f", sum/ nums.length));

    }
}
