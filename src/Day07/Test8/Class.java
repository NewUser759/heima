package Day07.Test8;

import java.util.Objects;

public class Class {
    private String className;

    @Override
    public String toString() {
        return "Class{" +
                "className='" + className + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(className, aClass.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Class() {
    }

    public Class(String className) {
        this.className = className;
    }
}
