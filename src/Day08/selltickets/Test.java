package Day08.selltickets;

public class Test {
    public static void main(String[] args) {
        new MyThread("[一号窗口]").start();
        new MyThread("[二号窗口]").start();
        new MyThread("[三号窗口]").start();
    }
}
