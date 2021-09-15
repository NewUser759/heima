package Day01.Test7;

public class Employee {

    //创建名字，id,部门属性的成员变量
    private String name;
    private String workId;
    private String dept;

    //员工（父类）构造方法
    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    public Employee() {
    }

    //成员变量set / get 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //show 方法   虽然设置了private私有属性， 但是本类中成员变量可以直接调用。
    public  void  showMsg(){
        System.out.println("员工名字：" + name + ",员工部门：" + dept + ",员工编号：" + workId);
    }
}
