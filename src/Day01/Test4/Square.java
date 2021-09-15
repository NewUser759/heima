package Day01.Test4;

public class Square extends Graph {
    private double length;        //long为关键字，不能定义long为变量名。
    private double width;


    //提供Square构造方法。满参/无参
    //构造方法名和类名一致
    //构造方法有返回值，但是无返回值类型，方法名前面不用声明返回值类型。
    //构造方法返回值为对象 ，作用就是创建一个对象
    //构造方法首字母大写
    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square() {
    }


    //提供长，宽set/get方法
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //方法重写
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getGirth() {
        return 2 * (width + length) ;
    }
}

