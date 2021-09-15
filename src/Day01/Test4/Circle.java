package Day01.Test4;

public class Circle extends Graph {


    //定义成员变量，r为半径， 只适用于该”圆“类 ， 使用private修饰
    //定义pi的值，且该值为最终常量值不可更改。
    public static final double PI = 3.14;
    private double r;


    // 提供 set / get 方法来调整调用r
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }



    //提供对象构造器
    public Circle(double r) {
        this.r = r;
    }



    //周长和面积的方法重写，有多少个abstract抽象方法就要重写多少个方法
    //方法重写方法名，返回值类型，形参列表都要与之前的abstract抽象方法一致。
    //加Override声明
    @Override
    public double getArea() {
        return PI * r * r ;
    }

    @Override
    public double getGirth() {

        //返回无冒号:   ,  直接return  返回值 ;
        return 2 * PI * r ;
    }
}
