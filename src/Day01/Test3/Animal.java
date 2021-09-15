package Day01.Test3;

public abstract class Animal {
    private String name;
    private int age;
    private boolean sex;
    private String color;

    public Animal(String name, int age, boolean sex, String color) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = color;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public abstract void  eat();

    public  abstract void  cry();
}
