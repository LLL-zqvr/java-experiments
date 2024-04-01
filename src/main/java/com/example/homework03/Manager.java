package com.example.homework03;

public class Manager extends Employee implements Workable{
    private int grade;//经理级别

    public Manager(String name, double salary, int grade) {
        super(name, salary);
        this.grade = grade;
    }

    public Manager(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public double calculateSalary(double salary){
       super.setSalary(super.getSalary() * grade * 0.8);
      // salary = salary * grade * 0.8;
        return super.getSalary();
    }

}
