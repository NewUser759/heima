package Day02.Test3;

public class NewPhone extends OldPhone implements Play{
    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}
