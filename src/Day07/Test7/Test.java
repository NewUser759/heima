package Day07.Test7;
/*
语法点：HashSet
        需求：使用HashSet集合，保存自定义的Person类对象；要求：
        1.Person应该具有姓名、性别和年龄三个属性；
        2.如果Person对象的姓名和性别相同，就认为是同一个人；

*/

import java.util.Comparator;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();

        people.add(new Person("张三",18,"男"));
        people.add(new Person("李四",18,"男"));
        people.add(new Person("王五",18,"男"));
        people.add(new Person("张三",18,"男"));
        people.add(new Person("李斯",18,"男"));
        for (Person person : people) {
            System.out.println(person);
        }



    }
}
