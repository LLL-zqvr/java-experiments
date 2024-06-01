package com.example.practice04.example01;

import com.example.practice04.example01.HelloRunnable;

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new HelloRunnable());
        t.start();
    }
}
