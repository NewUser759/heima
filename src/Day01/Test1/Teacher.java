package Day01.Test1;

public class Teacher extends Person{
    public Teacher(String name, boolean sex, int age) {
        super(name, sex, age);
    }

    public Teacher() {
    }

    public void teach(){
            System.out.println(this.getName() + "在教书");
        }
}
