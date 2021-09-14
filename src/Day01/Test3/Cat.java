package Day01.Test3;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println(this.getName() + "吃猫粮");
    }

    @Override
    public void cry(){
        System.out.println(this.getName() +   "喵喵喵");
    }

    public Cat(String name, int age, boolean sex, String color) {
        super(name, age, sex, color);
    }

    public Cat() {
    }
}
