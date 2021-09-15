package Day070.test10;

/*
* 语法点：多线程
需求：开启一个线程执行任务：随机获得10个100到1000的整数并将10个整数相加求和，将求和结果输出。
* */


import java.util.Random;

public class test {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                Random r = new Random();
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    int num = r.nextInt(900) + 100;
                    sum += num;
                    System.out.println(num);
                }
                System.out.println(sum);

            }
        }).start();

    }
}
