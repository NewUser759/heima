package Day07.Test8;

/*语法点：Map
        需求：一个年级有若干个班级，每个班级有若干个学生；要求：
        1.学生具有学号、姓名和成绩，学号和学生信息是一一对应的；
        使用集合保存这个年级的所有学生的信息，然后遍历输出*/

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Student, Class> scMap = new HashMap<>();
        HashSet<Student> s = new HashSet<>();
        //HashSet<Student> s = new HashSet<>();
        HashMap<String, HashSet<Student>> cgMap = new HashMap<>();

        Student s1 = new Student("zhangsan", "101", 80);
        Student s2 = new Student("lisi", "102", 83);
        Student s3 = new Student("wangwu", "103", 80);
        Student s4 = new Student("zhangsan", "101", 80);
        Student s5 = new Student("erbanlisi", "201", 80);
        Student s6 = new Student("erbanwangwu", "202", 80);

       Collections.addAll(s,s1,s2,s3,s4);
       cgMap.put("1班",s);

      // cgMap.put("2班",)


    }
}
