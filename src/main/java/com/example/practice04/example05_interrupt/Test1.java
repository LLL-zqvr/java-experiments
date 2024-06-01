package com.example.practice04.example05_interrupt;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static
    void main(String[] args) throws InterruptedException {
        Thread t = new Thread(
                () -> {
                    for(int i = 0; i < 5; i++){
                        System.out.println(i);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e){
                            System.out.println("Interrupted!");
                        }
                    }
                }
        );
        t.start();
        //Thread.sleep(2000);
    }

}
