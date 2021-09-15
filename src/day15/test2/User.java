package day15.test2;

public class User implements LoginAble{
    @Override
    public void login() {
        System.out.println("用户登录");
    }
}
