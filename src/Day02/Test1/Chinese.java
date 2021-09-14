package Day02.Test1;

public class Chinese {
    private  String name;
    static  String country ="中国";

    public static final double PI = 3.14;
    public static final double DD = 2;


    public Chinese(String name) {
        this.name = name;
    }

    public Chinese() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Chinese.country = country;
    }

    //static 修饰方法 静态方法 不能作为对象使用 只能通过类名.方法名(实参)使用
    // 同一个类中 类名可以省略
    public static int sum(int a , int b){
        return a + b;
    }
}
