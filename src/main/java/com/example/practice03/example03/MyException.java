package com.example.practice03.example03;

//自定义非受检异常
public class MyException extends RuntimeException{
    //自定义构造函数
    public MyException(String message){
        super(message);
    }
    public MyException(String message, Throwable cause){
        super(message, cause);
    }

}
