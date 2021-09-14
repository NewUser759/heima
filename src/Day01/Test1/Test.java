package Day01.Test1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三",true,18);
        s.study();
        Teacher t = new Teacher("lisi",false,28);
        t.teach();
    }
}
