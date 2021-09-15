package day09.baozi2;

/**
 *
 *
 * 三个线程轮流 123123123123123
* */

public class Test01 {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi();
        new BaoZIStore(baozi).start();
        new EatKing(baozi).start();
    }
}
