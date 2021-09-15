package Day07.Test8;

import java.util.Objects;

public class Student {
    private String name;
    private String numId;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numId='" + numId + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name) && Objects.equals(numId, student.numId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numId, score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, String numId, int score) {
        this.name = name;
        this.numId = numId;
        this.score = score;
    }
}
