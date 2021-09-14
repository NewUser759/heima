package Day01.Test4;

public class Test {

    //  public static void main(String[] args) 方法/程序唯一入口
    public static void main(String[] args) {
        Circle c = new Circle(1);
        System.out.println("圆形的面积为："  + c.getArea());
        System.out.println("圆形的周长为： "  + c.getGirth());

        // 通过new + 构造方法调用 来创建新对象，通过变量名：s 来接收， s 的数据类型为引用数据类型 Square,
        // (1,2) 为实参存储在堆内存。
        Square s = new Square(1, 2);
        s.getArea();
        s.getGirth();
        //成员方法的调用： 通过”对象名.“方法来调用
        s.getLength();
        s.getWidth();
        System.out.println("长方形的面积为" + s.getArea());
        System.out.println("长方形的周长为" + s.getGirth());

    }
}
