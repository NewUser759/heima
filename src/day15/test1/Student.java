package day15.test1;

public class Student {
    private static Student student;

    private Student(){}

    public synchronized static Student getInstance(){
        if (student == null){
            student = new Student();
        }
        return student;
    }

}
