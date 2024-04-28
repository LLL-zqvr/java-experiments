package com.example.homework05.resource;

import com.example.homework05.entity.College;
import com.example.homework05.entity.Student;
import com.example.homework05.entity.Teacher;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student> STUDENTS = create();
    private static List<Student> create() {
        List<Student>students = new ArrayList<>();
        College college1 = new College("计算机学院");
        College college2 = new College("软件工程学院");
        Teacher teacher1 = new Teacher("1", "张老师", college1);
        Teacher teacher2 = new Teacher("2", "王老师", college2);
        Student stu1 = new Student("1111", "a", teacher1, "2");
        Student stu2 = new Student("2222", "b", teacher2, "2");
        Student stu3 = new Student("3333", "c", teacher1, "3");
        Student stu4 = new Student("4444", "d", teacher2, "1");
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        return students;
    }
    public static List<Student> studentslist(){
        return STUDENTS;
    }

}
