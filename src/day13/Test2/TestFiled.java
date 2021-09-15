package day13.Test2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class TestFiled {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取字节码对象
        Class studentClass = Student.class;



        //获取public 公共修饰的成员变量
        Field country = studentClass.getField("country");


        //创建对象只能通过获取构造方法创造对象 需强转
        Student s = (Student) studentClass.getConstructor().newInstance();

        //修改public成员变量的值 set --> 无返回值   需要提供对象，修改的变量
        country.set(s,"中国");

        //获取修改后的public成员变量的值  get   需要提供对象
        System.out.println(country.get(s));


        //获取成员变量  如果private私有修饰的  需要暴力反射 不然会运行报错 NoSuchFieldException (编译不会报错)
        // Field age = studentClass.getField("age");
        // System.out.println(age);


        Field age = studentClass.getDeclaredField("age");


        //修改私有修饰的成员变量需要先设置权限,不然会运行报错 IllegalAccessException (编译不会报错)
        age.setAccessible(true);

        //设置的值的属性也要和原始的属性一致 不然会运行报错 IllegalAccessException (编译不会报错)
        age.set(s,18);
        System.out.println(age.get(s));


        ArrayList<String> strings = new ArrayList<String>();
     //   strings.size()

    }
}
