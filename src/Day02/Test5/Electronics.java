package Day02.Test5;

public abstract class Electronics {
    public abstract void open();        //抽象方法里面没有方法体
    // {
    //     System.out.println("开机");
    // }

    public abstract void close();
    // {       //不是所有的电子产品都有玩游戏功能 ， 所以玩游戏的功能用接口实现
    //     System.out.println("关机");
    // }

}
