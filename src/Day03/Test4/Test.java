package Day03.Test4;

/*
* 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
* */

import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");//设置日期格式
    }
}
