package com.example.practice04.example04_TimeUnit;

import java.util.concurrent.TimeUnit;

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
                            //比上一个改进了一点，有了时间单位的转换
                            //以下是5秒的写法
                            //5秒后程序才结束进程
                            TimeUnit.SECONDS.sleep(5);
                        }catch (InterruptedException e){

                        }
                    }
                }
        ).start();
        System.out.println("main thread ending!");
    }
}
