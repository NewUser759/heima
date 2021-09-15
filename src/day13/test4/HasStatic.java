package day13.test4;


public class HasStatic {
    private static int x=100;
     public static void main(String args[]){
                   HasStatic hs1=new HasStatic();
                   hs1.x++;
                   HasStatic  hs2=new HasStatic();
                   hs2.x++;
                   hs1=new HasStatic();
                   hs1.x++;
                  HasStatic.x--;
                  System.out.println("x="+x);

                  double sum = -5 + 1/4 + 2*-3 + 5.0;
         System.out.println(sum);
         }

}
