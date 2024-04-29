package com.example.homework07;

import com.example.homework07.entity.Railway;

public class Test {
    public static void main(String[] args) {
      Railway railway = new Railway(200);
        Thread thread1 = new Thread(railway);
        Thread thread2 = new Thread(railway);
        Thread thread3 = new Thread(railway);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
