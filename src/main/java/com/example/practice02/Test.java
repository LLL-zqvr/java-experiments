package com.example.practice02;

import com.example.practice02.entity.Computer;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<Computer> op = Optional.ofNullable(null);
        Optional<Computer> op2 = Optional.of(new Computer());

    }
}
