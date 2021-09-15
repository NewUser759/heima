package day09.baozi03;

public class Test {


    public static void main(String[] args) throws IllegalThreadStateException {

        BaoZi baoZi = new BaoZi();
        ChuFang chuFang = new ChuFang(baoZi);
        BaoZiPu baoZiPu = new BaoZiPu(baoZi);
        ChiHuo chiHuo = new ChiHuo(baoZi);
        chuFang.setName("厨房，线程3号3333");
        chiHuo.setName("吃货，线程2号2222");
        baoZiPu.setName("包子铺，线程1号1111");


            baoZiPu.start();
            chiHuo.start();
            chuFang.start();





    }
}
