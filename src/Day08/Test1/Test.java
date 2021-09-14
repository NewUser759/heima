package Day08.Test1;




public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {     //创建匿名线程调用start开始执行
            @Override
            public void run() {     //线程内调用Runnable实现类对象 重写run方法
                Print p = new Print();
                while (true){
                    p.print();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Print p = new Print();
                while (true){
                    p.print2();
                }
            }
        }).start();




    }
}
