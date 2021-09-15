package Day05.bean;

public abstract class Person {

    private String id;
    private String name;
    private String sex;
    private int age;
    private String Birthday;

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public Person(String id, String name, String sex, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        Birthday = birthday;
    }



    //获取身份
    public abstract String getIdentity();

    //获取工作内容
    public abstract String getContent();



    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", Birthday='" + Birthday + '\'' +
                '}';
    }
}
