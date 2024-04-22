package com.example.homework04.resource;

import com.example.homework04.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student>STUDENTS = create();
    //添加——模拟若干对象
    //创造——创建包含学生数据的集合的方法
    private static List<Student> create() {
        List<Student> students = new ArrayList<>();
        students.add( new Student("1", "张三", Student.Sex.FEMALE, 2022));
        students.add( new Student("2", "李四", Student.Sex.MALE, 2021));
        students.add( new Student("3", "王五", Student.Sex.FEMALE, 2022));
        students.add( new  Student("4", "王鹏", Student.Sex.MALE, 2020));
        return students;
    }
    public static List<Student> listStudents() {
        return STUDENTS;
    }


}
