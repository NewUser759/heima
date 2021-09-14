package day15.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserTest {
    public static void main(String[] args) {
        //不使用动态代理
        User user = new User();
        user.login();

        System.out.println("-----------------");

        //使用动态代理
        LoginAble o = (LoginAble) Proxy.newProxyInstance(LoginAble.class.getClassLoader(), User.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置增强");
                Object o = method.invoke(user, args);
                System.out.println("后置增强");
                return o;
            }
        });
        o.login();


    }
}
