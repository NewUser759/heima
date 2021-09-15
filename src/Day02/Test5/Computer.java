package Day02.Test5;

public class Computer extends Electronics implements PlayGame{
    @Override
    public void open() {
        System.out.println("电脑开机");
    }

    @Override
    public void close() {
        System.out.println("电脑关机");
    }

    @Override
    public void playGame() {
        System.out.println("电脑打LOL");
    }
}
