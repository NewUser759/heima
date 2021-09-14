package day10.Test3;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        boolean newFile = new File("E:\\copy.txt").createNewFile();

        FileInputStream fis = new FileInputStream("D:\\stu.txt");
        FileOutputStream fos = new FileOutputStream("E:\\copy.txt");

        byte[] b = new byte[1024 * 8];

        int len;

        while (( len = fis.read(b)) != -1 ){
                fos.write(b);
        }

        fis.close();
        fos.close();

    }
}
