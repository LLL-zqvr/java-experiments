package com.example.homework02;
public class User {
    //用户实体类
    private String name;
    private double money;
    private String location;
    //全属性构造函数
    public User(String name,double money,String location){
        this.name = name;
        this.money = money;
        this.location = location;
    }
    //getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getMoney(){
        return money;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
