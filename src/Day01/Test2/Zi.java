package Day01.Test2;

public class Zi extends Fu{
    public Zi(String name, int age, boolean sex, String adress) {
        super(name, age, sex, adress);
    }

    public Zi() {
    }

    public void work(){
        System.out.println(this.getName() +   "通过写代码养家");
    }
}
