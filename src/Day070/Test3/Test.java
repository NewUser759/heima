package Day070.Test3;


//二分法查找




import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr= {4,35,56,2,199,44,5,98};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要找的值： ");
        int findNum = sc.nextInt();

        Arrays.sort(arr);

        int left  = 0;
        int right = arr.length-1;
        int index = -1 ;

        while ( right >= left){
        int middle = (left + right)  / 2 ;
            if (findNum > arr[middle]){
                left = middle+1;
            }else  if (findNum < arr[middle]){
                right = middle-1;
            }else {
                System.out.println("找到了要找的值的位置是： " + middle);
                index = 1;
                break;
            }
        }

        if (index == -1 ){
            System.out.println("找不到所在的值的位置");
        }else{
            return;
        };



    }
}
