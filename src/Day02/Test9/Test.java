package Day02.Test9;

/*
* 语法知识点：接口
需求：模拟公司给员工发公司，代码实现，效果如图所示：

开发提示：
1. 定义员工Employee类。包含属性：姓名，薪资
2. 定义经理Manager类继承Employee类
3. 定义程序员Coder类继承Employee类
4. 定义Money接口，提供抽象方法paySalary,参数为Employee
5. 定义公司Company类，实现Money接口,Company类包含公司总资金属性
6. 定义测试类，创建Company对象，Manager对象，Coder对象，调用公司paySalary方法，给Manager和Coder发工资
*
编写步骤：
1. 定义Employee类,包含属性：姓名，薪资
2. 定义经理Manager类继承Employee类
3. 定义程序员Coder类继承Employee类
4. 定义Money接口包含抽象的paySalary方法,参数为(Employee emp)
5. 定义Company类,实现Money接口,Company类包含公司总资金属性
6. 在Company类中重写paySalary方法.当给一个员工发工资的时候.公司总资金减去已发工资
7. 在main方法中创建Manager对象m
8. 在main方法中创建Coder对象c
9. 在main方法中创建Company对象
10. 在main方法中调用Company的paySalary方法,传入m和c对象
*
*
*
*
*
*
*
*
* */

public class Test {
    public static void main(String[] args) {
        Massager m = new Massager("张小强",9000);
        Coder c = new Coder("李晓亮",5000);
        Company company = new Company(99999);

        company.paySalary(c);
        company.paySalary(m);
    }
}
