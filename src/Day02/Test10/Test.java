package Day02.Test10;

/*
* 需求：模拟各种商品添加到购物车，电子商品打8.8折优惠，展示所有商品信息。
代码实现，效果如图所示：

开发提示：
1.定义购物车类。
2.使用ArrayList作为成员变量，保存各种商品对象。
3.提供添加商品，移除商品，计算总价的方法。
4.定义商品类Goods，包含商品名称，id，价格等属性。
5.定义电子商品类EGoods继承Goods。
6.定义笔记本类Laptop继承电子商品EGoods类。
7.定义手机类继承继承电子商品EGoods类类。
8.定义水果类Fruit继承商品类。
*---------------------------
编写步骤：
1. 定义Goods商品类,包含商品编号id,商品名称name,商品价格price属性
2. 定义EGoods继承Goods类
3. 定义Phone继承EGoods类
4. 定义Laptop继承EGoods类
5. 定义Fruit继承Goods类
6. 定义购物车类GouWuChe
7. 在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
8. 在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods).addGoods方法功能是将商品保存到
ArrayList集合中
9. 在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品信息并打印
10. 在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后价
格,并输出
11. 在main方法中创建GouWuChe对象gouWuChe
12. 在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000
13. 在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000
14. 在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50
15. 调用购物车的addGoods方法将3个商品添加到购物车中
16. 调用购物车的showGoods方法,显示购物车中的商品信息
17. 调用购物车的total方法,显示购物车中所有商品的价格
*
*
*
* 没做完  不会做。。。
* */



public class Test {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Goods laptop = new Laptop("g1000","笔记本",5000.0);
        Goods phone = new Phone("g1001","手机",3000.0);
        Goods fruit = new Fruit("g001","水果",100.0);

        System.out.println("============添加商品=================");
        //15. 调用购物车的addGoods方法将3个商品添加到购物车中
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        System.out.println("============打印商品=================");
        gouWuChe.showGoods();
        gouWuChe.total();


    }
}
