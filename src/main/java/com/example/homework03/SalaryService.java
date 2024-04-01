package com.example.homework03;

public class SalaryService {
    public static double getTotalSalaries (Employee[] employees){
        double sum = 0;
        for(int i = 0; i <employees.length; i++){
            sum += employees[i].calculateSalary(employees[i].getSalary());
        }
       return sum;
    }

}
