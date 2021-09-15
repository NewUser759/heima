package Day03.Test1;

public class Test {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        run1();
        long ed = System.currentTimeMillis();
        long ut = ed - st;
        System.out.println(ut);
    }

    private static void run1() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("打印第"+ (i+1)+"次数据" );
        }
    }
}
