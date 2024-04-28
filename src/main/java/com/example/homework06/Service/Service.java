package com.example.homework06.Service;

import com.example.homework06.entity.Boat;
import com.example.homework06.entity.Box;

public class Service {
    public static Boat service(Boat boat, Box[] boxes){
        int sum = 0;
        for (Box box : boxes) {
            sum += box.getWeight();
        }
        if(boat.getWeight() < sum){
           throw new MyException("货船id为:" + boat.getId() + ", 货船的名称为: " + boat.getName() + ", 超出的重量是:" + (sum - boat.getWeight()));
        }else {
            boat.setBoxes(boxes);
            System.out.println(boat.getName());
            return boat;
        }
    }
}
