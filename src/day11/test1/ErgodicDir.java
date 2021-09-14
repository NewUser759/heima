package day11.test1;

/*
*
* 遍历E盘复制出来的"copy微信记录"文件夹及其下面的所有文件并打印在一个新的记事本中
*
* */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ErgodicDir {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("e:\\copy微信记录");

        //更改打印位置为txt文件
        System.setOut(new PrintStream("e:\\copy微信记录.txt"));
        printFile(file);
    }

    /**
     * 此方法用于打印文件夹中的所有文件
     */
    private static void printFile(File file) throws FileNotFoundException {
        // 遍历文件夹, 获取到每一个文件和文件夹
        File[] files = file.listFiles();


        if (files != null) {
            for (File f : files) {
                // 判断如果是文件就打印
                if (f.isFile()) {


                    System.out.println(f);
                } else {
                    // 如果是文件夹就递归
                    printFile(f);
                }
            }
        }

    }
}
