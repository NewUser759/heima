package Day02.Test10;

public class Goods {
    //1. 定义Goods商品类,包含商品编号id,商品名称name,商品价格price属性
    private String goodsId;
    private String name;
    private Double price;


    public Goods(String goodsId, String name, Double price) {
        this.goodsId = goodsId;
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
