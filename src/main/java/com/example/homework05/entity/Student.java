package com.example.homework05.entity;

public class Student {
    private String id;
    private String name;
    private Teacher teacher;
    private String grade;

    public Student(String id, String name, Teacher teacher, String grade) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
