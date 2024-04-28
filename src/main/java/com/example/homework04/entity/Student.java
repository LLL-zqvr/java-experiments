package com.example.homework04.entity;

public class Student {
    //Student实体类
    //为性别设置元组规定输入范围
    public enum Sex {
        MALE, FEMALE
    }

    private int id;//学生id
    private String name;//学生姓名
    private Sex sex;//学生性别
    private int year;//入学年份

    public Student() {
    }

    public Student(int id, String name, Sex sex, int year) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
