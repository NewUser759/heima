package day09.baozi;

public class Test01 {
       static boolean baozi = false;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (Test01.class){
                        if (!baozi){
                            System.out.println("吃货快来吃包子");
                            try {
                                Test01.class.wait();        //通过锁对象调用
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        baozi = true;
                        Test01.class.notify();      //通过锁对象调用
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (Test01.class){
                        if (baozi){
                            System.out.println("包子铺快来做包子");
                            try {
                                Test01.class.wait();        //通过锁对象调用
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        baozi = false;
                        Test01.class.notify();      //通过锁对象调用
                    }
                }
            }
        }).start();
    }
}
