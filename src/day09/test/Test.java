package day09.test;

public class Test {

        public static void main(String[] args) {

            new Thread(new Printer(0)).start();
            new Thread(new Printer(1)).start();
            new Thread(new Printer(2)).start();

    }
}

