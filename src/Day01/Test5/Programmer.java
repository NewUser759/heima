package Day01.Test5;

public class Programmer extends Worker{
    public Programmer() {
    }

    public Programmer(String name, boolean sex, String id, double salary) {
        super(name, sex, id, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + "是一个薪资为" + this.getSalary() +  "的程序员，它的工作是敲代码");
    }
}
