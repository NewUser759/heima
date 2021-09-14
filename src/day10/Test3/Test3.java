package day10.Test3;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("E:\\heima\\1.4.2面试宝典.pdf");
        File[] files = file.listFiles();
        print(files);

    }

    private static void print(File[] files) {
        if (files != null){
            for (File f : files) {
                if (f.isFile()){
                    System.out.println(f);
                }else{
                  //  print(f);
                }

            }
        }
    }
}
