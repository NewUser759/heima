package Day02.Test4;

public class Student extends Person implements Smoke {


    private String id;

    public Student(String id) {         //构造方法不能继承
        this.id = id;
    }

    public Student() {

    }

    public void study(){
        System.out.println("学生还会学习");
    }


    @Override
    public void eat() {
        System.out.println("学生吃剩饭");
    }

    @Override
    public void smock() {
        System.out.println("学生抽中华");          //这里没有学生对象 无法通过学生对象调用学生名字
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
