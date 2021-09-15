package day09.baozi2;

public class BaoZIStore extends Thread{
     BaoZi baozi;


    public BaoZIStore(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baozi) {
                if (baozi.isBaozi()) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺做包子");
                baozi.setBaozi(true);
                baozi.notify();
            }
        }
    }
}
