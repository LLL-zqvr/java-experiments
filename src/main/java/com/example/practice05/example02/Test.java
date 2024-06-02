package com.example.practice05.example02;

public class Test {
    public static void main(String[] args) {
        try(MyResource r = new MyResource()) {
            System.out.println("Try");
            throw new Exception();
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
    }
}
