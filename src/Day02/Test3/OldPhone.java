package Day02.Test3;

public class OldPhone {

    public void call(){
        System.out.println("旧手机打电话");
    }
    public void sendMassage(){         //这里方法如果是用private修饰 在另一个类中不能通过对象调用 。成员方法用public修饰
        System.out.println("旧手机发短信");
    }




}
