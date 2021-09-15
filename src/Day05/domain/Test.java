package Day05.domain;

import Day05.bean.Person;
import Day05.bean.Student;
import Day05.bean.Teacher;
import Day05.utils.ManagerUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> stuList = new ArrayList<>();
        ArrayList<Person> teaList = new ArrayList<>();
            //  一级界面
        while (true){
            System.out.println("欢迎使用管理系统");
            System.out.println("1.学生管理系统        2.教师管理系统        3.退出系统");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择你需要的业务：");
            int i = sc.nextInt();
            switch (i){
                case 1 :
                    System.out.println("进入学生管理系统");
                   // stuMassager(stuList);
                    break;

                case 2 :
                    System.out.println("进入教师管理系统");
                    //teaMassager(teaList);
                    break;

                case 3 :
                    System.out.println("退出");
                    return; //直接退出大循环(main程序)
            }
        }
    }

    private static void stuMassager(ArrayList<Student> stuList) {
        while (true){
            System.out.println("-------------------------");
            System.out.println("1.增加学生\t\t2.更改学生\t\t3.查询学生\t\t4.删除学生\t\t5.返回\t");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println("请输入功能序号：");
            switch (i){
                case 1:
                    System.out.println("增加学生");
                    break;
                case 2:
                    System.out.println("更改学生");
                    break;
                case 3:
                    System.out.println("查询学生");
                    //findAllStudent(stuList);
                    break;
                case 4:
                    System.out.println("删除学生");
                    break;
                case 5:
                    //System.out.println("返回");
                    return;
            }
        }
    }


    private static void teaMassager(ArrayList<Teacher> teaList) {
        while (true){
            System.out.println("-------------------------");
            System.out.println("1.增加老师\t\t2.更改老师\t\t3.查询老师\t\t4.删除老师\t\t5.返回\t");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("增加老师");
                    break;
                case 2:
                    System.out.println("更改老师");
                    break;
                case 3:
                    System.out.println("查询老师");
                    break;
                case 4:
                    System.out.println("删除老师");
                    break;
                case 5:
                    //System.out.println("返回");
                    return;
            }
        }
    }

    private static void findAllStudent(ArrayList<Person> stuList) {
        //添加测试数据测试功能是否正常
        Student s1 = new Student("0","张三","男",18,"2020-10-10");
        Student s2 = new Student("0","李四","男",18,"2020-10-10");
        stuList.add(s1);
        stuList.add(s2);

        //判断有无数据
        if (stuList.size() == 0){
            System.out.println("无数据");
            return;
        }
        System.out.println("查询结果:");
        ManagerUtils.showAllPerson(stuList);
    }


    private static void findAllTeacher(ArrayList<Person> teaList) {
        //添加测试数据测试功能是否正常
        Teacher s1 = new Teacher("0","张三","男",18,"2020-10-10");
        Teacher s2 = new Teacher("0","李四","男",18,"2020-10-10");
        teaList.add(s1);
        teaList.add(s2);

        //判断有无数据
        if (teaList.size() == 0){
            System.out.println("无数据");
            return;
        }
        System.out.println("查询结果:");
        ManagerUtils.showAllPerson(teaList);
    }



}
