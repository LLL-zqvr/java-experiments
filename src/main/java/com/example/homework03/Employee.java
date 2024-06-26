package com.example.homework03;

public class Employee implements Workable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //行为
    @Override
    public void updateName(String reName) {
        this.name = reName;
    }

    @Override
    public double calculateSalary(double salary) {
        return salary;
    }
}
