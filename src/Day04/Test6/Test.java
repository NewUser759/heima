package Day04.Test6;


/*
* 4.现有一个字符数组{'i','t','c','a','s','a'}，请使用System类中的arraycopy()方法在控制台输出“itcast”。
* （提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
*
* */

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char [] arr = {'i','t','c','a','s','a'};
        System.arraycopy(arr,1,arr,5,1);
        System.out.println(Arrays.toString(arr));


    }

}
