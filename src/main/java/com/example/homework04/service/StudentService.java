package com.example.homework04.service;

import com.example.homework04.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
        //向集合添加一名学生，返回当前学生
    List<Student> addStudent(Student student);
    //列出指定年级的全部学生
    List<Student> listStudentByYear(int year);
    //列出指定年级，指定性别的全部学生的姓名
    List<Student> listStudentsNames(int year, Student.Sex sex);
    //列出指定年级的全部学生，按学生ID逆序排列
    List<Student> listStudentsByYearSortedById(int year);
    //将所有学生按性别分组
    Map<Student.Sex, List<Student>> listStudentsMapBySex();
    //列出指定年级学生，按学号分组
    Map<Integer, List<Student>> listStudentsByYearMapById(int year);
    //移除指定学号的学生，返回是否移除
   boolean removeStudent(int id);




}

