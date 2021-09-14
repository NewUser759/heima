package Day02.Test8;


/*
*
* 语法点：匿名内部类使用
需求：请编写一个接口Phone,两个抽象方法,call() sendMessage() 使用匿名内部类的方式调用 call 和 sendMessage方法
*
*
* */

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone(){          //匿名内部类不用继承/实现， 直接在对象重写
            @Override
            public void call() {
                System.out.println("打电话");
            }

            @Override
            public void sendMessage() {
                System.out.println("发短信");
            }
        };

        phone.call();
        phone.sendMessage();
    }
}
