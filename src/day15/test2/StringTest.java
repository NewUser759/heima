package day15.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StringTest {
    public static void main(String[] args) {

        String s = "abc";
        //要使用父类接收， 不能使用本类接收
        CharSequence o = (CharSequence) Proxy.newProxyInstance(String.class.getClassLoader(), String.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //前置曾强
                //调用原方法
                Object i = method.invoke(s, args);

                //后置增强
                //返回null会空指针异常
                return i;
            }
            
        });

        System.out.println(o.length());
    }
}
