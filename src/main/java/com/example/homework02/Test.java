package com.example.homework02;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("小诗诗",350000,"东北林业大学");

        System.out.println("用户名称为：" + user1.getName());
        System.out.println("用户的金额为：" + user1.getMoney());
        System.out.println("用户的地址为：" + user1.getLocation());
        Product product1 = new Product("步步高点读机",350);
        Product product2 = new Product("鼠标",2000);
        Product product3 = new Product("电脑",30000);
        Item item1 = new Item(product1,2);
        Item item2 = new Item(product3,1);
        Item[] items = {item1,item2};
        Order oder = new Order(null,null,0);
       oder = OrderService.addOder(user1,items);
       if(oder == null){
           System.out.println("用户余额不足");
       }else{
           System.out.println("该次购买的商品价格总额为： " + oder.getSum());
           System.out.println("用户余额为： " + oder.getUser().getMoney());
           System.out.println("快递地址为： " + oder.getUser().getLocation());

       }



    }
}
