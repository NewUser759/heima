package Day02.Test1;

public interface MyInter {

    //静态常量
    public static final  int NUM = 10 ;
    //抽象方法
    public abstract void  abstractMethod();
    //默认方法：类中不能有default
    public  default void defaultMethod(){
        System.out.println("我是一个默认方法");
    }
    //静态方法
    public static void staticMethod(){
        System.out.println("我是一个静态方法");
    }
}
