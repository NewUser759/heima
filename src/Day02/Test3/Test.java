package Day02.Test3;

import java.util.TreeMap;

/*
* 语法点:接口 继承
需求：1.两个手机类OldPhone和NewPhone都有call()和sendMessage()方法.
2.定义接口Play,Play中有一个抽象的玩游戏的方法playGame()，NewPhone	3.实现Play接口有玩游戏的功能;
4.要求:分别测试OldPhone和NewPhone的call()和sendMessage()方法,再测试新手机palyGame()的方法。
按步骤编写代码，效果如图所示：
*
* print:
* 旧手机打电话
* 旧手机发短信
* 新手机打电话
* 新手机发短信
* 新手机玩游戏
*
*
* */
public class Test {
    public static void main(String[] args) {

        //NewPhone phone = new OldPhone();
        OldPhone op = new OldPhone();           //这里为什么不能用 NewPhone op = new OldPhone?
        op.call();                              //原因：  子类引用指向父类方法，编译不通过。
        op.sendMassage();

        System.out.println("-------------------");



        OldPhone np = new NewPhone();          //这里 OldPhone np = new NewPhone(); 创建成功了
        //np.playGame();                         //np.playGame 使用不了 编译错误
        np.call();                              //执行结果 ：  旧手机打电话
        np.sendMassage();                       //执行结果     旧手机发短信


        System.out.println("-------------------");


        /*
        *       上面的代码： NewPhone (子类) 继承OldPhone (父类)
        *       父类引用指向子类对象 为多态
        *       编译时： 调用成员方法看父类有无该方法--> OldPhone 无playGame方法 ，故编译不通过 ，
        *       父类有call和sendMessage方法 可编译通过
        *
        *       使用时： 对象的方法覆写父类方法，使用的子类的方法所以应该为  ”新手机打电话/发短信“
        *       但是这里没有进行新手机方法重写，所以还是调用的旧手机的方法
        *
        *
        *
        * */





        NewPhone newPhone = new NewPhone();
        newPhone.sendMassage();                         //旧手机发短信     -->新手机没有重写发短信和打电话方法，所以引用父类的方法
        newPhone.playGame();                            //新手机玩游戏
        newPhone.call();                                //旧手机打电话

    }
}
