package Day02.Test5;


/*
*
* 1.定义类描述手机和电脑，二者都具有开机、关机和玩游戏的功能，并提供测试类测试玩游戏的东西；
* */

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Computer computer = new Computer();
        phone.open();
        phone.playGame();
        phone.close();
        computer.open();
        computer.playGame();
        computer.close();
    }
}
