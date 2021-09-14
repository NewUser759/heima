package Day070.Test4;

public class Test {
    public static void main(String[] args) {
        try{
            String s = "hello";
            //s= null;                          //若先设置s对象为null 再进行截取会有异常
            String sub = s.substring(0);        //先截取后设置s对象为null,不发生异常
            System.out.println(sub);
            s= null;

        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }
    }
}
