package com.example.practice05.example02;

public class MyResource implements AutoCloseable{


    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }

}
