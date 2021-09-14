package day15.test1;

public class Person {
    private Person(){}

    private static final Person p = new Person();

    public static Person getInstance(){
        return p;
    }
}
