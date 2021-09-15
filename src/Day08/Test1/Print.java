package Day08.Test1;

public class Print {
    public void print(){
        synchronized (Print.class){         //synchronized 同步 让执行时内部代码不会被抢走执行权
            System.out.print("黑");          //要同步的代码
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.println();
        }

    }

    public void print2(){                   //sy放在while内
        synchronized (Print.class){         //锁对象为this时，相当于有后门 还是会强线程乱序
            System.out.print("传");          //class字节码文件时唯一的
            System.out.print("智");
            System.out.print("教");
            System.out.print("育");
            System.out.println();
        }



    }
}
