package com.example;

public class Item {
    //购买向实体类
    private Product product;//购买的商品
    private int number;//购买数量
    //全属性构造函数

    public Item(Product product, int number) {
        this.product = product;
        this.number = number;
    }
    //getter and setter
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


