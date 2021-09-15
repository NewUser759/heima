package Day02.Test9;

public class Company implements Money{

    private int allMoney;

    @Override
    public void paySalary(Employee employee) {
        int sum = allMoney - employee.getSalary();

        System.out.println("给" + employee.getName() + "发工资" + employee.getSalary() + "元,公司剩余"
        + sum + "元");


    }

    public Company(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }
}
