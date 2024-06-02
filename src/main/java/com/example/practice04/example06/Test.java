package com.example.practice04.example06;

import java.util.Random;

public class Test {
    Random r = new Random();
    public synchronized void incrementSync(){
        try {
            Thread.sleep(r.nextInt(50));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
