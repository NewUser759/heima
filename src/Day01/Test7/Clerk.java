package Day01.Test7;



public class Clerk extends Employee{
    //设置经理变量,该变量为对象变量，数据类型为引用对象类型，前面不用加private;
    Manager m;

    //设置该类的构造方法
    public Clerk(String name, String workId, String dept) {
        super(name, workId, dept);

    }

    public Clerk() {
    }


    //设置成员变量(经理)的set / get 方法

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m = m;
    }


    //show 方法重写

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println(this.getName() + "的经理是："+ m.getName() );
    }
}
