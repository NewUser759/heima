package day09.test1;


// 123123123线程循环
//if  判断一次， while重复判断
//线程醒来之后从wait处继续执行

public class Test {
    public  static  int num = 1;
    public static void main(String[] args) {
        new Thread(() -> {
                while (true){
                    synchronized (Test.class){
                        while (num != 1){
                            try {
                                Test.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("第1条线程");
                        num = 2;
                        Test.class.notifyAll();
                    }
                }
            }).start();

        new Thread(() -> {
                while (true){
                    synchronized (Test.class){
                        while (num != 2){
                            try {
                                Test.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("第2条线程");
                        num = 3;
                        Test.class.notifyAll();
                    }
                }
            }).start();

        new Thread(() -> {
                while (true){
                    synchronized (Test.class){
                        while (num != 3){
                            try {
                                Test.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("第3条线程");
                        num = 1;
                        Test.class.notifyAll();
                    }
                }
            }).start();




    }
}
