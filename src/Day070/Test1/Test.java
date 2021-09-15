package Day070.Test1;

//冒泡排序比较数组

public class Test {

    public static void main(String[] args) {
            int[] arr ={1,2,3,4,5,6};
        for (int i = 0; i < arr.length-1; i++) {    //注意这里是数组长度-1 ，直接等于长度的话会角标越界
            for (int j = 0; j < arr.length-1-i; j++) {      //这里再减i是减少轮数，已经放到最后的数不用再比较
                if (arr[j+1]-arr[j] < 0){       //注意这里是j+1 和 j 比较， 不是 j 和 i 比较
                    int temp ;          //设定一个暂定值， 操作大小数互换
                    temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
