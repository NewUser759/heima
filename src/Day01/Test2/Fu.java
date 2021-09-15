package Day01.Test2;

public class Fu {
    private String name;
    private int age;
    private boolean sex;
    private  String address;

    public Fu(String name, int age, boolean sex, String adress) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = adress;
    }

    public Fu() {
    }

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void work(){
        System.out.println(this.name + "通过种地养家");
    }

}
