package day15.test1;

public class Test {
    public static void main(String[] args) {
      /*  Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Person.getInstance());
                }
            }
        };

        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }*/


         Runnable b = ()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Student.getInstance());
            }
        };



        for (int i = 0; i < 100; i++) {
        new Thread(b).start();
        }





    }
}
