package Day01.Test5;

public class Hr extends Worker {
    public Hr() {
    }

    public Hr(String name, boolean sex, String id, double salary) {
        super(name, sex, id, salary);
    }

    @Override
    public void work(){
        System.out.println(this.getName() + "是一个薪资为" + this.getSalary() +  "的HR，它的工作是招聘");
    }
}
