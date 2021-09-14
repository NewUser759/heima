package day13.Test3;


//获取Person字节码对象的成员变量

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestField {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        //获取字节码对象
        Class pC = Person.class;
        //通过字节码对象创建对象实例
        Person p = (Person) pC.newInstance();

        //通过字节码对象来获取Person对象的成员变量
        //获取所有的成员变量,提供成员变量的变量名
        pC.getField("id");
        pC.getField("gender");
        Field gender = pC.getDeclaredField("gender");
        System.out.println(gender);


        //私有的需要declared
        pC.getDeclaredField("name");
        pC.getDeclaredField("age");


        Class classType=Person.class;
        Object tester=classType.newInstance();
        Method addMethod=classType.getMethod("test",new Class[]{int.class,Integer.class});
        Object result=addMethod.invoke(tester,new Object[]{new Integer(100),new Integer(200)});
        //修改获取到的成员变量的值





    }
}
