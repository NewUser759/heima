package test.test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> cart = new HashMap<>();     //cart 代表购物车


        //不断循环 如果是输入end 结束循环
        while (true){
            System.out.println("请输入你选择的店铺和产品");
            String product = sc.nextLine();

            if(product.equals("end")){
                break;
            }

            //判断key是否重复
            if (cart.containsKey(product)){
                 int count = cart.get(product);
                  count++;
                  cart.put(product,count);
            }else {
                cart.put(product,1);
            }

        }

        //遍历
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry);
        }


        String[] s = new String[10];
        s = new String[]{"一", "二", "三"};
        for (String s1 : s) {
        //    System.out.println(s1);
        }




    }
}
