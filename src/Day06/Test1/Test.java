package Day06.Test1;

/*
*
* 语法点：ArrayList 迭代器 增强for
需求：创建一个ArrayList集合，添加一些整数，然后使用不同的方式遍历这些数据。
* */


import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        for (int i : array) {
            System.out.println(i);
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("---------------------------");


        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("小六");
        list.add("老七");
        list.add("老七");
        System.out.println(list.contains("老七"));

        System.out.println(list.remove("老七"));
        System.out.println(list);



        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        ArrayList<Student> studentList = new ArrayList<>();
        Student s1 = new Student("张三",33,"男");
        Student s2 = new Student("李四",40,"男");
        Student s3 = new Student("王五",15,"男");
        Student s4 = new Student("小六",16,"男");
        Student s5 = new Student("老七",72,"男");
        Student s6 = new Student("张三",33,"男");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s1);
        studentList.add(s1);
        studentList.add(s1);
        System.out.println(studentList);
        Iterator<Student> it = studentList.iterator();
        for (Student student : studentList) {

            System.out.println(student);
        }

        System.out.println("==============");
        int a = 0;
        int index = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if ( a < studentList.get(i).getAge()){
                a = studentList.get(i).getAge();
                index = i;
            }
        }
        System.out.println(a);
        studentList.get(index).setName("小猪佩奇");
        System.out.println(studentList.get(index));

        System.out.println("==============");

        studentList.remove(s1);
        System.out.println(studentList.contains(s1));

        System.out.println("******************");
        studentList.remove(s6);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));

        }


    }
}
