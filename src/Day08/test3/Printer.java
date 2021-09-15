package Day08.test3;

public class Printer {
     private static int count = 0;        //定义一个次数的成员变量设置为10000次

    public static synchronized void print(){
        for (int i = 0; i < 10001; i++) {
            System.out.println(Thread.currentThread()+ "第" + i + "次打印");
        }
    }
}
