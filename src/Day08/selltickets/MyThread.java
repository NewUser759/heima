package Day08.selltickets;

public class MyThread extends Thread{
    private static int tickets =  100;   //共享100张票  如果不设置共享 会每个窗口卖100张票
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
      /* synchronized (MyThread.class) {
            for (int i = 0; i < 100; i++) {         //如果是for i++形式，共用100张票， 会卖到300张票
                                                    //如果是for i++形式， 票数为成员变量，会每个窗口都卖100张票
                System.out.println(getName() + "在卖第" + (101 - tickets) + "张票");
                tickets--;

            }*/

        /*
        while (true){
            try {           //sleep会有异常 需用try /catch 处理掉
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyThread.class){
                if (tickets==0){
                     break;
                }else {
                    System.out.println(getName() + "在卖第" + (101-tickets) + "张票");
                    tickets--;
                }
            }
        }
        */




    }
}
