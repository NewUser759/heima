package Day02.Test4;

public abstract class Person {
    private String name;
    private Boolean sex;
    public int age;

    public Person(String name, Boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

}
