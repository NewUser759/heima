package Day04.Test10;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2 {
        public static void main(String[] args) {
            String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};

            BigDecimal result = new BigDecimal("0");//存储结果的BigDecimal

            for (String num : nums) {//遍历数组
                BigDecimal bd = new BigDecimal(num);//将数组的每个元素构造一个BigDecimal对象
                result = result.add(bd);//累加到result中
            }
            //result / 数组长度，结果取2位小数，并且四舍五入
            BigDecimal avg = result.divide(new BigDecimal(nums.length), 2, RoundingMode.HALF_UP);
            System.out.println("平均值：" + avg.doubleValue());//打印结果
        }
    }




