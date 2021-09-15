package Day02.Test2;

public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("BBBB");

    };
}
