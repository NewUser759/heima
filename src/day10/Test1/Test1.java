package day10.Test1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
       // E:\HeiMa\javase-code
        File file = new File("JavaSE_code\\src\\a.txt");

        System.out.println(file);

        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
    }
}
