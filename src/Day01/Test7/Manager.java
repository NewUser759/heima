package Day01.Test7;


public class Manager extends Employee{
    //设置经理类继承员工类
    //设置经理类成员变量， 成员变量为职员：Clerk ，成员变量类型为职员对象类型： Clerk
    Clerk c;

    //设置经理类构造方法

    public Manager(String name, String workId, String dept) {
        super(name, workId, dept);

    }

    public Manager() {

    }


    //设置成员变量 职员 set / get 方法
    public Clerk getC() {
        return c;
    }

    public void setC(Clerk c) {
        this.c = c;
    }

    //show方法重写
    @Override
    public void showMsg() {
        super.showMsg();

        //this.getName()方法调用为该类的成员变量名字，该类为继承类， 所以含有父类的成员变量,
        // this为”这个“谁调用就是谁的，经理调用所以为经理的名字。
        //c.getName() 为员工的名字。
        System.out.println(this.getName() + "的职员是：" + c.getName());
    }
}
