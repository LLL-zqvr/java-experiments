package com.example.homework06;
import com.example.homework06.entity.Boat;
import com.example.homework06.entity.Box;
import static com.example.homework06.Service.Service.service;

public class Test {
    public static void main(String[] args) {
        Box box1 = new Box(1, 23);
        Box box2 = new Box(2, 34);
        Box box3 = new Box(3, 12);
        Box box4 = new Box(4, 44);
        Box[] boxes1 = {box1, box2, box3};
        Box[] boxes2 = {box2, box4};
       Boat boat1 = new Boat(1, "01", 50, null);
       Boat boat2 = new Boat(2, "02", 100, null);
        System.out.println(boat1.getId() + " " + boat1.getName() + " " + boat1.getWeight() + " " );
        /*
        System.out.println("物品信息为:");
        for(int i = 0; i < boat1.getBoxes().length; i++){
            System.out.println(boat1.getBoxes()[i].getId() + " " + boat1.getBoxes()[i].getWeight());
        }

         */
        System.out.println(boat2.getId() + " " + boat2.getName() + " " + boat2.getWeight() + " " );
        /*
        System.out.println("物品信息为:");
        for(int i = 0; i < boat2.getBoxes().length; i++){
            System.out.println(boat2.getBoxes()[i].getId() + " " + boat2.getBoxes()[i].getWeight());
        }

         */
        service(boat2, boxes2);
        service(boat1, boxes1);


    }
}
