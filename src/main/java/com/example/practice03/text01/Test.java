package com.example.practice03.text01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        try {
            Files.readString(Path.of("C:/aa.aa"));
        }catch(IOException e) {
            System.out.println("异常啦!");
        }
        System.out.println("那我呢？");
    }
}
