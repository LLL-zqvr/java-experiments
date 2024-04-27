package com.example.homework04;

import com.example.homework04.entity.Student;
import com.example.homework04.service.Impl.StudentServiceImpl;
//import com.example.homework04.service.StudentService;
//import com.example.homework04.service.Impl.StudentServiceImpl.*;

//import java.util.*;
//import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.example.homework04.resource.DatabaseUtils.listStudents;

public class Test {
    public static void main(String[] args) {
        List<Student>students;
        Student student1 = new Student(11, "Kevan", Student.Sex.MALE, 2000);
        //静态方法若是要调用非静态方法，需要通过创建对象的方式来完成。
        StudentServiceImpl studentService = new StudentServiceImpl();
        //添加一个学生
        students = studentService.addStudent(student1);
        for (Student value : students) {
            System.out.println(value.getId() + "," + value.getName());
        }
        System.out.println("=============================================");
        //列出指定年级的全部学生
        students = studentService.listStudentByYear(2020);
        for (Student student : students) {
            System.out.println(student.getId() + "," + student.getName());
        }
        System.out.println("=============================================");
        //根据
        students = studentService.listStudentsByYearSortedById(2022);
        for (Student student : students) {
            System.out.println(student.getId() + "," + student.getName());
        }
        System.out.println("=============================================");
        Map<Student.Sex, List<Student>>map;
        map = studentService.listStudentsMapBySex();
        map.forEach((key, value)->{
            System.out.println(key + " " + value);
        });
        System.out.println("=============================================");


    }

}
