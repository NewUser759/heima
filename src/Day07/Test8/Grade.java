package Day07.Test8;

import java.util.Objects;

public class Grade {
    private String gradeName;

    public Grade(String gradeName) {
        this.gradeName = gradeName;
    }

    public Grade() {
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeName='" + gradeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(gradeName, grade.gradeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeName);
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
