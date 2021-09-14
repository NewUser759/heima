package day11.test1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
*
* 通过common-is   jar包：FileUtils ：   FileUtils.copyDirectory() 方法
* 把D盘下的“微信记录”文件夹整个拷贝到E盘的“copy微信记录”文件夹中
*
* 总共耗时63秒 / 5.8G
* 第二次耗时14秒/ 5.8G
* */

public class CopyDir {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileUtils.copyDirectory(new File("D:\\微信记录"),new File("E:\\copy微信记录"));
        long end = System.currentTimeMillis();

        System.out.println("耗时" + (end-start)/1000 +"秒");
    }



}
