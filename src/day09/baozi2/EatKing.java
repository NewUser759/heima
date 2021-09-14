package day09.baozi2;

public class EatKing extends Thread {
     BaoZi baozi ;


    public EatKing(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baozi) {
                if (!baozi.isBaozi()) {     //   --> baozi.isBaozi() 布尔值类型默认为false 这里代表没有包子
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货吃包子！！！");
                baozi.setBaozi(false);      //包子的状态和if的包子状态要相反  -->这里代表有包子
                baozi.notify();
            }
        }
    }

}
