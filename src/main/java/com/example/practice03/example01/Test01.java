package com.example.practice03.example01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test01 {
    public static void main(String[] args) {
        try {
            Files.readString(Path.of("C:/aa.aa"));
            Thread.sleep(1000);
        }catch (IOException e) {
            System.out.println("捕获IOException异常");
        } catch (InterruptedException e) {
            System.out.println("捕获InterruptedException异常");
        }
    }
}
