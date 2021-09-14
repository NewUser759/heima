package day10.Test3;

import java.io.File;

public class Test4 {
        public static void main(String[] args) {

            File file = new File("E:\\heima");

            printFile(file);
        }

        /**
         * 此方法用于打印文件夹中的所有文件
         */
        private static void printFile(File file) {
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
