package day11.test1;


/*
*
* 使用buffer字节流+数组复制文件夹并记录花费时间
*
*
* 字节流/字符流不能拷贝文件夹！！！
* 通过压缩文件的形式测试
*
* 复制压缩的5.1G文件耗时：  9秒 。
* */

import java.io.*;

public class CopyDirTest {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\微信记录.rar"));
        // 创建高效输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy微信记录.rar"));

        long start = System.currentTimeMillis();

        byte[] bytes = new byte[1024 * 8];
        // 读写
        int b;
        while ((b = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }

        long end = System.currentTimeMillis();
        System.out.println("拷贝5.8G的资源, 共耗时: " + (end - start) / 1000 + "秒");
        // 关流
        bos.close();
        bis.close();

    }
}
