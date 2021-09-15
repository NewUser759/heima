package day13.Test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //通过包名.类名获得字节码对象
        Class aClass = Class.forName("day13.Test2.Student");

        //通过类名.class获取字节码对象
        Class pc = Student.class;

        //通过对象名获取字节码对象
        Student p = new Student();
        Class c3 = p.getClass();

        //  System.out.println(aClass.hashCode());
        //  System.out.println(pc.hashCode());
        //  System.out.println(c3.hashCode());


        //获取类中"指定"的public修饰的构造方法(String name)  构造方法使用的参数类型
        Constructor c = c3.getConstructor(String.class);
        // System.out.println(c);

        //通过获取的构造方法创建对象  需要使用多态，提供对应的形参， 强转
        Student z = (Student) c.newInstance("张三");
        //System.out.println(z);


        //获取类中所有的public修饰的构造方法，返回方法数组
        Constructor[] cs = c3.getConstructors();

        //遍历数组/集合 需要通过循环
        /*
        for (Constructor con : cs) {
            System.out.println(con);
        }*/


        //暴力获取  非 public 修饰的所有构造方法
        Constructor[] dcs = c3.getDeclaredConstructors();
      /*  for (Constructor dc : dcs) {
            System.out.println(dc);
        }*/

        //暴力获取  非 public 修饰的某个特定的构造方法 (String name, int age)
        Constructor dcq = c3.getDeclaredConstructor(String.class, int.class);

        //非public 修饰的方法 需要设置权限才能修改
        //设置修改权限 --> 可修改
        dcq.setAccessible(true);


    }
}
