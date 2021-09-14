package Day05.bean;

public class  Student extends Person{
    public Student() {
    }

    public Student(String id, String name, String sex, int age, String birthday) {
        super(id, name, sex, age, birthday);
    }

    @Override
    public String getIdentity() {
        return "学生";
    }

    @Override
    public String getContent() {
        return "学习";
    }
}
