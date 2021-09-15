package Day02.Test5;

public class Phone extends Electronics implements PlayGame{
    @Override
    public void open() {
        System.out.println("手机开机");
    }

    @Override
    public void close() {
        System.out.println("手机关机");
    }

    @Override
    public void playGame() {
        System.out.println("手机玩王者荣耀");
    }
}
