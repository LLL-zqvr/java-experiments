package com.example.homework062;
import java.util.ArrayList;
import com.example.homework062.resource.OverWeightException;
import com.example.homework062.entity.Ship;
import com.example.homework062.resource.LoadService;
import com.example.homework062.entity.Container;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 接收货船信息
        System.out.println("请输入货船的ID、名称和总重量（用空格分隔）：");
        int id = sc.nextInt();
        String name = sc.next();
        int weight = sc.nextInt();
        Ship ship = new Ship(id, name, weight);

        // 接收集装箱信息
        System.out.println("请输入集装箱组数：");
        int groupCount = sc.nextInt();

        List<Container> containers = new ArrayList<>();
        for(int i = 1; i <= groupCount; i++){
            System.out.println("请输入第 " + i + " 组集装箱数量：");
            int count = sc.nextInt();
            for(int j = 1; j <= count; j++){
                System.out.println("请输入第 " + j + " 个集装箱的ID和重量（用空格分隔）：");
                int containerId = sc.nextInt();
                int containerWeight = sc.nextInt();
                containers.add(new Container(containerId, containerWeight));
            }
            try {
                LoadService.loadShip(ship, containers);
            } catch (OverWeightException e) {
                System.out.println("货船ID：" + e.getShipId() + "；货船名称：" + e.getName() + "；超重：" + e.getExcessWeight());
            } finally {
                System.out.println("货船ID：" + ship.getId() + "；货船名称：" + ship.getName() + "；第1次货物装载完毕");
            }
        }

        // 装载集装箱并捕获异常

    }

}

