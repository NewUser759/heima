package Day02.Test3;

public abstract interface Play {            //  接口中一般写抽象方法和default(默认)方法，然后通过子实现类实现
                                            //接口名前面的abstract可以写可以不写
    public abstract void playGame();        //接口没有成员方法，一般用抽象方法，然后实现类实现
}
