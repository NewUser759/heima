package Day01.Test5;

public abstract class Worker {
    private String name;
    private boolean sex;
    private String id;
    private double salary;

    public Worker() {
    }

    public Worker(String name, boolean sex, String id, double salary) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public abstract void work();
}
