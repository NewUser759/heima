package Day01.Test8;



/*
*语法点：抽象类 继承
需求：编写程序,实现游戏中的英雄系统；要求：
1.提供至少两个英雄；
2.英雄的属性：名称；HP；MP；攻击力；防御；
3.英雄的功能：三个攻击技能，一个说台词的功能；
4.每种技能需要消耗固定MP，MP不足则无法释放技能；
5.技能也是一种事物，具有名称、消耗的mp以及对基本攻击加成的属性；
*
*
*未完成， 可进一步修改
*
*
* */


public class Test {
    public static void main(String[] args) {

        LuBan luBan = new LuBan("鲁班7号",5400 , 3300, 120, 80);
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();
        luBan.skillThree();

    }
}
