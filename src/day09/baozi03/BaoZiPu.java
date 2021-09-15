package day09.baozi03;

public class BaoZiPu extends Thread {
    private BaoZi baozi;


    public BaoZiPu(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (Test.class) {
                if (baozi.getBaozi() == 0) {        //判断包子状态为0
                    System.out.println(Thread.currentThread().getName());       //打印包子铺线程名字

                    try {       //包子铺睡觉
                        Test.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                baozi.setBaozi(1);      //修改包子参数
                Test.class.notify();        //如果执行到这里
               // System.out.println("我包子铺线程1回来了");
            }
        }
    }
}


