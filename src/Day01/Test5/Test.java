package Day01.Test5;

public class Test {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("张伟");
        p.setSalary(20000);
        p.work();
        Hr h = new Hr();
        p.setSalary(10000);
        h.setName("小花");
        h.work();
    }
}
