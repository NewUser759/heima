package day10.Test2;

import java.io.*;
import java.util.Scanner;

/*
* 语法点：字节流
需求：从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
当用户输入end时停止输入。
操作步骤描述：
1.使用Scanner类进行键盘录入数据
2.创建字节输入流对象关联目标文件
3.使用死循环不停的接收用户输入的学生数据
4.接收用户输入的学生数据
5.判断输入的内容是否是end，是则终止循环，停止输入。否则就数据写出到文件中。
*
*
* */
public class Test {
    public static void main(String[] args) throws IOException {
        new File("D:\\stu.txt").createNewFile();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String s ="";
        FileInputStream fis = new FileInputStream("D:\\stu.txt");
        FileOutputStream fos = new FileOutputStream("D:\\stu.txt",true);
        while (!s.endsWith("end")){
            s = sc.next();

            byte[] b = s.getBytes();
            fos.write(b);

        }

        fos.close();
        fis.close();

    }

}
