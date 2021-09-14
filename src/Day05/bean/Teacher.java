package Day05.bean;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String id, String name, String sex, int age, String birthday) {
        super(id, name, sex, age, birthday);
    }

    @Override
    public String getIdentity() {
        return "老师";
    }

    @Override
    public String getContent() {
        return "讲java";
    }
}
