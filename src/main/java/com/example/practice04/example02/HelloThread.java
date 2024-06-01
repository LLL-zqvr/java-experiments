package com.example.practice04.example02;

public class HelloThread extends Thread{
    //Thread类实现了Runnable接口，但实际的run（）为空
    //所以可以继承Thread类，并重写run()方法实现任务
    public void run(){
        System.out.println("Hello from HelloThread");
    }
}
