package Day070.Test6;


public  class  Demo{
    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }


        public static void func() throws Exception{
            try {
                throw new Exception();
            }finally {
                System.out.println("B");
            }

        }





}
