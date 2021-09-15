package Day08.test2;

public class Print {
    public static synchronized void print(){    //synchronized放在方法中声明时，默认调用this锁对象
                                                //为确保没有后门， 使用static 改为class字节码为锁对象
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.println();


    }

    public static synchronized void print2(){

            System.out.print("传");
            System.out.print("智");
            System.out.print("教");
            System.out.print("育");
            System.out.println();




    }
}
