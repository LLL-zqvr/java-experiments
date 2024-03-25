package com.example;

public class OrderService {
    //订单业务逻辑处理
    public static Order addOder(User user,Item[] items){
        //订单里的是用户user和购买的商品项数组Item[] items
       double sum = 0;
       Order oder = new Order(null,null,0);
       for(int i = 0;i <items.length;i++){
           sum += items[i].getProduct().getPrice() *items[i].getNumber();
       }
       if(sum <= user.getMoney()){
           user.setMoney(user.getMoney() - sum);
           oder.setSum(sum);
           oder.setUser(user);
           oder.setItems(items);
           return oder;
       }else{
           return null;
       }
    }
}
