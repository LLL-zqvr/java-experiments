package com.example.practice03.example02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    private static void getCheckedException() throws IOException {
        Files.readString(Path.of("C:/aa.aa"));
    }
    //等同于(应该吧。。。):
    private static void getCheckedExceptional(){
        try {
            Files.readString(Path.of("C:/aa.aa"));
        }catch(IOException e) {
            System.out.println("异常");
        }
    }

    public static void main(String[] args) throws IOException {
        getCheckedException();
    }
}
