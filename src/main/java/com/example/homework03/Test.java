package com.example.homework03;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("小李", 5000,2);
        Seller seller = new Seller("小王",3000,20000,0.15);
        double salary1 = manager.getSalary();
        double salary2 = seller.getSalary();
        //Employee employee1 = new Employee();
        //Employee employee2 = new Employee();
        Employee[] employees = {manager, seller};
        //Employee[] employees = {employee1, employee2};
        double sum;
        //System.out.println(manager.getSalary());
        //System.out.println(seller.getSalary());
        sum = SalaryService.getTotalSalaries(employees);
        System.out.println(sum);
    }
}
