package day13.Test3;

public class Student {


            private String name;

            public Student(String name) {
                this.name = name;
            }

            public static void main(String[] args) {
                Student yang = new Student("yangyang");
                Class<? extends Student> aClass = yang.getClass();
                System.out.println(aClass.getName());


                System.out.println(aClass.getSimpleName());

            }


}
