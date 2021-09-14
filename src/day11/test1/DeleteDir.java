package day11.test1;


/*
*
* 删除E盘copy的"copy微信记录"文件夹及其下面的所有文件
*
* */

import java.io.File;

public class DeleteDir {
    public static void main(String[] args) {
        deleteDirectory(new File("e:\\copy微信记录"));
    }

    /**
     * 此方法用于删除文件夹
     */
    private static void deleteDirectory(File file) {
        // 遍历文件夹
        File[] files = file.listFiles();
        // 遍历数组, 获取到每一个文件和文件夹
        for (File f : files) {
            // 如果是文件, 就删除
            if (f.isFile()) {
                f.delete();
            } else {
                // 如果是文件夹, 就删除这个文件夹, 递归调用
                deleteDirectory(f);
            }
        }

        // 最后要删除空文件夹
        file.delete();
    }
}
