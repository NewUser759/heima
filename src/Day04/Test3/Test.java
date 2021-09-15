package Day04.Test3;

import java.util.Random;


//1-100内生成5个不同的随机数放入数组
/*
* 1.创建长度为5的数组
* 2.设置随机数范围
* 3.生成随机数，判断有无重复，有重复继续生成
* 4.如果没有重复，放入数组中
*
*
* */

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        int i = 0;
        while (i < arr.length){
            int num = random.nextInt(5)+1;
            if (!contain(arr ,num)){            //判断条件 --->设计成方法传数据判断值在不在数组中
                arr[i] = num;
                i++;
            }
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }

    }

    public static boolean contain(int[] arr  ,int num ){        //同类中方法可以调用
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
