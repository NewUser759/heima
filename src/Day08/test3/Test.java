package Day08.test3;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Printer p = new Printer();
                    p.print();
                }
            },"线程i").start();   //start 才是开启线程， run只是调用方法
        }




    }
}
