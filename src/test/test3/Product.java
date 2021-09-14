package test.test3;

import java.util.Objects;

public class Product {
    private String store;   //店铺名称
    private String name;    //商品名称

    public Product() {
    }

    public Product(String store, String name) {
        this.store = store;
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(store, product.store) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, name);
    }
}
