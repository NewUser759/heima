package day13.test4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 *  语法点：
 * 需求：
 * 1. 现有集合：ArrayList<Integer>list = new ArrayList();
 * 2. 利用反射机制在这个泛型为Integer的ArrayList中存放一个String类型的对象。
 *
 *
 * */

public class TestCalcuator {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);

        Class<ArrayList> aClass = (Class<ArrayList>) list.getClass();
        //这里是创建了新的集合对象，不是原来的集合
        ArrayList list1 = aClass.newInstance();
        list1.add("张三");
        System.out.println(list1);

        //这里参数不能填String.class  ,因为原集合中没有该方法
        Method add1 = aClass.getMethod("add", Object.class);
        //通过创建的反射对象来调用原本的对象
        add1.invoke(list,"张三");
        System.out.println(list);

    }

}
