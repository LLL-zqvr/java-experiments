package com.example.practice04.example03_Thread.sleep;

public class Test {
    public static void main(String[] args) {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        int amount = 5;
                        for(int i = 0; i < amount; i++){
                            System.out.println(i);
                        }
                        try {
                            Thread.sleep(1000);
                        }catch (InterruptedException e){

                        }
                    }
                }
        ).start();
        System.out.println("main thread ending!");
    }
}
