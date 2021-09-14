package test.test1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        student.setName("小红");
        student.setScore(80);
        student2.setName("小明");
        student2.setScore(90);

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(student);
        list1.add(student2);



        int sum = 0 ;
        for (int i = 0; i < list.size(); i++) {
       //     sum += list.get(i);
            sum += list1.get(i).getScore();
        }
        System.out.println("两人的平均值为:" + sum/list.size());
    }
}
