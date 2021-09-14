package Day02.Test2;
/*
* 语法点：接口
需求：按步骤编写代码，效果如图所示：
AAAA
BBBB
*
编写步骤：
1. 定义接口A，普通类B实现接口A
2. A接口中，定义抽象方法showA。
3. A接口中，定义默认方法showB。
4. B类中，重写showA方法
5. 测试类中，创建B类对象，调用showA方法，showB方法。
*
*
* */


public class Test {
    public static void main(String[] args) {
        A b = new B();
        b.showA();
        b.showB();
    }
}
