package Day01.Test1;

public class Student extends Person{
    public Student(String name, boolean sex, int age) {
        super(name, sex, age);
    }

    public Student() {
    }

    public void study(){
        System.out.println(this.getName() + "在学习");
    }
}
