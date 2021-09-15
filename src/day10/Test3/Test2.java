package day10.Test3;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        //s1.length()
        File file = new File("D:\\");

        //遍历文件夹 -->获取文件路径
        for (File l : file.listFiles()) {
            System.out.println(l);
        }

        System.out.println("-------------");


        //遍历文件名--> 结果无路径属性
        for (String s : file.list()) {
            System.out.println(s);
        }
    }



}
