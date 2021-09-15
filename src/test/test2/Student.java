package test.test2;

public class Student {

        private String name;
        private int score;
        public Student() {

        }
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        //1.提供对应的get/set方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
