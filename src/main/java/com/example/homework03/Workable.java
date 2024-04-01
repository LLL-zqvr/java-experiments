package com.example.homework03;

public interface Workable {
    //通过传入的字符串修改姓名
    public abstract void updateName(String name);
    //返回计算的薪资
    public abstract double calculateSalary(double salary);

}
