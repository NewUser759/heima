package Day02.Test10;

import java.util.ArrayList;

/*
* 6. 定义购物车类GouWuChe
7. 在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
8. 在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods).addGoods方法功能是将商品保存到
ArrayList集合中
9. 在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品信息并打印
10. 在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后价
格,并输出
*
* */
public class GouWuChe {
    public GouWuChe() {
    }

       ArrayList<Goods> list =  new ArrayList();

    public void addGoods(Goods goods){
        System.out.println("加入" + goods.getName() + "成功");
        list.add(goods);
    }



//在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品信息并打印
    public void showGoods(){
        System.out.println("你选购的产品为：");
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            System.out.println(g.getGoodsId() + "\t" + g.getName() +"\t" + g.getPrice() );
        }

    }


    public void total(){
        double off = 0;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            double price = g.getPrice();
            sum += price;
            if (g instanceof EGoods){
                price *=0.88;
            }
            off += price;
        }
        System.out.println("------------------");
        System.out.println("原 价为:" + sum + " 元");
        System.out.println("折后价为:" + off + " 元");
    }


}
