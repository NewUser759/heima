package day10.Test3;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\heima");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }

        new File("E:\\copyheima").createNewFile();


        FileInputStream fis = new FileInputStream("E:\\heima");
        FileOutputStream fos = new FileOutputStream("E:\\copyheima");
        byte[] bytes = new byte[1024 * 8];
        int len ;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes);
        }


        System.out.println(new File("E:\\copyheima"));

    }
}
