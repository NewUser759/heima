package Day02.Test4;


/*
* 语法点：接口 继承 抽象
需求：按照以下说明，编写代码：
1.创建类描述学生和老师，其中学生和老师都具有姓名、性别、年龄的属性，以及相同的睡觉功能，和不同的吃饭功能；
	2.学生和老师都有抽烟和不抽烟之分，抽烟不是只有学生和老师才具有的行为；
	思考应该使用什么技术描述抽烟的行为；
*
*
*   不抽烟的老师和学生怎么实现？？
*   为什么要用接口抽象化抽烟这个方法？不抽象化吃饭？
*
*   创建抽烟的学生和老师类继承老师和学生，普通的学生和老师只继承Person类， 不实现Smoke接口
*
* */

public class Test {
    public static void main(String[] args) {
        Student s = new Student("007");
        Teacher t = new Teacher("老黄",true,28);

        Teacher t2 = new Teacher();         //构造器不能被继承

        s.setName("小红");
        s.setAge(18);
        s.smock();
        System.out.println(s.getName() + "学号：" + s.getId() + "今年" + s.getAge() + "岁。");
        s.study();

        t.eat();
        t.teach();
        t.smock();
        System.out.println(t.getAge());
        //set / get 方法不属于私有所以能被调用和继承，
        // 名字/年龄属性是私有属性，可以被继承，但是不能被调用
        //  如果要调用私用属性， 应该通过set/ get 方法调用
        System.out.println(t.getName());


    }
}
