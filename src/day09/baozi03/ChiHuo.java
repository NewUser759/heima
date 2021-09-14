package day09.baozi03;

public class ChiHuo extends Thread {
    private BaoZi baozi;


    public ChiHuo(BaoZi baozi) {
        this.baozi = baozi;

    }

    @Override
    public void run() {
        while (true){
            synchronized (Test.class) {
                if (baozi.getBaozi() == 1 ) {
                    System.out.println(Thread.currentThread().getName());


                    try {
                        Test.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                baozi.setBaozi(2);
                Test.class.notify();
              //  System.out.println("我吃货线程2回来了");
            }
        }
    }
}
