package Day02.Test7;

/*
*
* 语法点：接口，多态
需求：1.定义一个父类Animal 包含name,weight属性和一个抽象的eat方法,
2.定义两个子类Dog和Cat,Dog特有方法lookHome,Cat特有方法catchMouse;并且重写eat方法,Dog吃骨头,Cat吃鱼
3.要求:使用多态形式创建Dog和Cat对象,调用eat方法,并且使用向下转型,如果是Cat类型调用catchMouse功能,如果是Dog类型调用lookHome功能
按步骤编写代码，效果如图所示：
*
* 狗吃骨头
* 猫吃鱼
* 老老实实看家
* 努力抓老鼠
*
* */


public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.eat();
        c.eat();

        if (d instanceof Dog ){     //instanceof 判断d是否属于狗类
            Dog d1 = (Dog) d;       //多态的向下转型
            d1.lookHome();
        }if (c instanceof Cat){
            Cat c1 = (Cat) c;
            c1.catchMouse();
        }

    }
}
