package Day01.Test4;


// 父类，提供面积和周长的方法， 因为不确定图型，所以提供2个抽象方法。该父类为抽象父类。
//可以没有成员方法或者成员变量， 不一定要提供
public abstract class Graph {

    // 提供面积的功能
    public abstract double getArea() ;


    // 提供周长的功能
    public abstract double getGirth();



}
