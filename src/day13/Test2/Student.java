package day13.Test2;

public class Student {
    public String country;
    private String name;
    private int age;
    private String address;

    public Student() {
    }


    public Student(String name) {
        this.name = name;

    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /*public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Student.country = country;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
