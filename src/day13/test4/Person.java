package day13.test4;



//创建Person类  用于测试反射
public class Person {


    //成员变量  设置公共的和私有修饰的
    public int id;
    public String gender;
    private String name;
    private int age;


    //构造方法
    public Person() {
    }

    //设置一个私有的构造方法
    private Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    //设置成员方法   有返回值/无返回值， 一个参数/多个参数
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    //公共的无返回值的成员方法
    public void publicFun() {
        System.out.println("公共的fun方法执行了");
    }


    //私有的无返回值的成员方法
    private void privateFun() {
        System.out.println("私有的fun方法执行了");
    }


    //公共的有参数的成员方法
    public String fun(int a) {
        System.out.println("有参有返回的fun方法执行了");
        return "哈哈";
    }

    //方法重写
    public void fun(String s, int a, boolean b) {
        System.out.println("有3个参数的fun方法执行了");
    }

    public int test(int p1, Integer p2){
    return p1+p2;
    }


}
