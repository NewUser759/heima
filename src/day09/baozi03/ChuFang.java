package day09.baozi03;

public class ChuFang extends Thread {
    private BaoZi baozi;


    public ChuFang(BaoZi baozi) {
        this.baozi = baozi;

    }

    @Override
    public void run() {
        while (true){
            synchronized (Test.class) {
                if (baozi.getBaozi() == 2 ) {
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Test.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                baozi.setBaozi(0);
                Test.class.notify();
               // System.out.println("我厨房线程3回来了");
            }
        }
    }
}
