package test.test2;

import java.util.ArrayList;

/*
  1.创建一个学生类，包含两个私有属性姓名（name）和成绩（score），并提供无参和有参构造，get/set方法
  2.创建两个ArrayList集合分别为list和list1
  3.添加3个学生对象到list集合中，分别为：
   姓名    成绩
   张三     99
   李四     66
   王五     77
  4.将list集合中，成绩最低的学生删掉。
  5.将删除后list集合中的学生对象放入list1集合中，并且在控制台上打印list1集合中学生的分数平均值
*/
public class Test1 {
    public static void main(String[] args) {
        //2.创建list,list1集合用于存储Student对象

        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Student> list1 = new ArrayList<>();

        // ___________________________________________

        Student stu = new Student("张三", 99);
        Student stu2 = new Student("李四", 66);
        Student stu3 = new Student("王五", 77);
        //3.将3个对象添加到list集合中

        list.add(stu);
        list.add(stu2);
        list.add(stu3);

       // ___________________________________________

        //删除成绩最低的学生
        int min = list.get(0).getScore();

        //4.获取出list集合中的最低分数,并将对应的学生删除，删除后list集合中的学生对象放入list1集合中。
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getScore() < min )
                min = list.get(i).getScore();
            index = i;
        }
        list.remove(index);

        for (Student s : list) {
            list1.add(s);
        }


      //  ___________________________________________


        //将除最低分数之外的学生成绩相加,求出总成绩
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            //5.遍历list1集合,把里面的学生成绩相加,求出总成绩
                sum += list1.get(i).getScore();

      //      ___________________________________________
        }
        System.out.println(sum/list1.size());
    }
}