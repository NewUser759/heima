package Day070.Test2;


//选择排序

public class Test {
    public static void main(String[] args) {
        int[] arr  = {4,3,5,6,7,4,7,8};
        for (int i = 0; i < arr.length-1; i++) {    //外循环轮数
            for (int j = 1+i    ; j < arr.length-1; j++) {
                //内循环次数，定义j初始为i的后一位，每轮与指定位置的下一位比较 需要+i
            if (arr[j] < arr[i]){
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            }
            System.out.println(arr[i]);     //注意打印放在内循环外   打印的是轮数
        }

    }
}
