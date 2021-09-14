package Day02.Test6;

public class C implements A,B{

    private int sum;

    public void add(int a , int b){
        sum = a + b ;
    }

    @Override
    public void show() {
        System.out.println(sum);
    }


}
