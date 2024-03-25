package com.example;

public class Product {
    //商品实体类
    private String name;
    private double price;
    //全属性构造函数
    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }
    //getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
