package Day02.Test4;

public class Teacher extends Person implements Smoke{
    public Teacher() {

    }

    @Override
    public void eat() {
        System.out.println("老师吃皇粮");
    }


    public void teach(){
        System.out.println("老师教书");
    }

    @Override
    public void smock() {
        System.out.println("老师抽芙蓉王");
    }


    public Teacher(String name, Boolean sex, int age) {
        super(name, sex, age);
    }



}
