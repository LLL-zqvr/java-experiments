package com.example.practice04.example06;

import java.util.Random;

public class Counter {
    private Random r = new Random();
    private int c;
    public void increment() {
        try {
            Thread.sleep(r.nextInt());
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int getC() {
        return c;
    }
}
