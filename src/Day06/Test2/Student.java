package Day06.Test2;

import java.util.ArrayList;
import java.util.Collection;

public class Student implements IDataOperation<Student>{

    ArrayList<Student> students =  new ArrayList();

    @Override
    public boolean add(Student t) {
        return false;
    }

    @Override
    public <T> boolean delete(T t) {
        return false;
    }

    @Override
    public <T> boolean update(Student student) {
        return false;
    }

    @Override
    public <T> Student get(T t) {
        return null;
    }

    @Override
    public Collection<Student> getAll() {
        return null;
    }



    private String id;// 学号
    private String name;// 姓名
    private String age;// 年龄
    private String address;// 居住地
    public Student() {}
    public Student(String id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
