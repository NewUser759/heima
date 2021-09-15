package Day070.Test7;
/*语法点：冒泡排序 选择排序
        需求：请对以下数组进行排序(分别用冒泡排序和选择排序)
        int[] arr = {1,432,4,325,24,365,25,89,6,3,476,875,846};*/

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,432,4,325,24,365,25,89,6,3,476,875,846};
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
