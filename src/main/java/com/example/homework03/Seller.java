package com.example.homework03;

public class Seller extends Employee implements Workable{
    private double sale;//销售额
    private double extra;//销售提成

    public Seller(String name, double salary, double sale, double extra) {
        super(name, salary);
        this.sale = sale;
        this.extra = extra;
    }

    public Seller(double sale, double extra) {
        this.sale = sale;
        this.extra = extra;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }
    public double calculateSalary(double salary){
       // super.setSalary(super.getSalary() + sale * extra);
        salary = salary + sale * extra;
        return salary;
    }
}
