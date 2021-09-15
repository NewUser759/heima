package Day01.Test7;

public class Test {
    public static void main(String[] args) {

        //创建职员和经理对象
        Clerk cl = new Clerk("李晓亮","C001","销售部");
        Manager ma = new Manager("张小强","M001","销售部");


        //为经理对象的成员变量赋值
         ma.setC(cl);
         cl.setM(ma);

        cl.showMsg();
        ma.showMsg();

    }
}
