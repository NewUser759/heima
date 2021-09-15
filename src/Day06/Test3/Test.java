package Day06.Test3;

import java.util.*;
import java.util.stream.Collector;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            ArrayList<String> list1 = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(3);
            list.add(0);


            list1.add("3333");
            list1.add("3334");
            list1.add("33");
            list1.add("3553");
            list1.add("33");
            list1.add("3233");





        System.out.println(list);
        Collections.shuffle(list);      //打乱排序
        System.out.println(list);
        Collections.sort(list);         //排序 从小到大
        System.out.println(list);
        System.out.println("*******************");
           Comparator c =  new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        } ;
           Collections.sort(list,c);
        System.out.println(list);


        System.out.println("*******************");
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);
        Collections.sort(list1);         //排序 从小到大
        System.out.println(list1);

    }
}
