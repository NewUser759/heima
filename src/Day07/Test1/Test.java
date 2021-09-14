package Day07.Test1;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        //ArrayList 有序， 可重复
        ArrayList<Integer> s3 = new ArrayList<>();
        s3.add(1);
        s3.add(2);
        s3.add(1);
        s3.add(5);
        s3.add(4);
        System.out.println(s3);


        //TreeSet 无序， 会自动排序，不可重复。
        TreeSet<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(5);
        s.add(4);
        System.out.println(s);

        // HashSet 无序，会自动排序，不可重复
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(1);
        s1.add(5);
        s1.add(4);
        System.out.println(s1);

        //LinkedHashSet 有序，不可重复
        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(1);
        s2.add(5);
        s2.add(4);
        System.out.println(s2);





    }
}
