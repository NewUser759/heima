package day11.test1;


/*
*
* 测试直接使用File 方法删除文件夹及其里面的文件
*
* 结果：  无法删除存在文件的文件夹，只有文件夹问空时才能删除。
*
* */

import java.io.File;

public class DeleteDir2 {
    public static void main(String[] args) {
        System.out.println(new File("e:\\copy微信记录").delete());
    }
}
