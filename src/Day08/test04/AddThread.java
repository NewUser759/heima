package Day08.test04;

public class AddThread extends Thread{
    private int  num = 0 ;

    public int getNum() {
        return num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            num++;
        }
    }
}
