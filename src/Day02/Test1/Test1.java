package Day02.Test1;

public class Test1 {
    public static void main(String[] args) {
        Chinese ch1 = new Chinese("袁");
        Chinese ch2 = new Chinese("彭");
        Chinese ch3 = new Chinese("小红");


        System.out.println(ch1.getName());
        String c = Chinese.country;
        System.out.println(c);
        System.out.println(Chinese.sum(10,20));
    }




}
