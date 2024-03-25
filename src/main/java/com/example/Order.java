package com.example;

public class Order {
    //订单实体类
    private User user;//用户
    private Item[] items;//购买的全部商品项
    private double sum;
    //全属性构造函数

    public Order(User user, Item[] items,double sum) {
        this.user = user;
        this.items = items;
        this.sum = sum;
    }

    //getter and setter

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
