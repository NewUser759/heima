package Day01.Test3;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println(this.getName() + "吃狗粮" );
    }

    @Override
    public void cry(){
        System.out.println(this.getName()  + "汪汪叫");
    }

    public Dog(String name, int age, boolean sex, String color) {
        super(name, age, sex, color);
    }

    public Dog() {
    }
}
