package com.example.homework062.resource;
import com.example.homework062.entity.Container;
import com.example.homework062.entity.Ship;

import java.util.List;
public class LoadService {

        public static Ship loadShip(Ship ship, List<Container> containers) throws OverWeightException {
            int sum = 0;
            for (Container container : containers) {
                sum += container.getWeight();
                if (sum > ship.getAllWeight())
                
                {
                    throw new OverWeightException(ship.getId(), ship.getName(), (sum - ship.getAllWeight()));
                }
                else{
                    ship.setContainers(containers);

                }

            }
            return ship;
        }



}
