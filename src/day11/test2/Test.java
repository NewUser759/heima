package day11.test2;


//使用commons-io 下载网上的图片


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        try {
            FileUtils.copyURLToFile(new URL("https://img2.baidu.com/it/u=333294395,1671364992&fm=26&fmt=auto&gp=0.jpg"),new File("E:\\1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
