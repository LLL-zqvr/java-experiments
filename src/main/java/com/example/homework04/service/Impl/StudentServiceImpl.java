package com.example.homework04.service.Impl;

import com.example.homework04.entity.Student;
import com.example.homework04.service.StudentService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.example.homework04.resource.DatabaseUtils.listStudents;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> addStudent(Student student) {
      List<Student> students = listStudents();
      students.add(student);
        return students;
    }

    @Override
    public List<Student> listStudentByYear(int year) {

        return listStudents()
                                                .stream()
                                                .filter(a -> year == a.getYear())
                                                .toList();

    }


    @Override
    public List<Student> listStudentsNames(int year, Student.Sex sex) {
        return listStudents()
                .stream()
                .filter(a -> year == a.getYear())
                .filter(a -> sex == a.getSex())
                .toList();
    }

    @Override
    public List<Student> listStudentsByYearSortedById(int year) {
        return listStudents()
                .stream()
                .filter(a -> year == a.getYear())
                .sorted(Comparator.comparing(Student::getId).reversed())
                .toList();
    }

    @Override
    public Map<Student.Sex, List<Student>> listStudentsMapBySex() {
        return listStudents()
                .stream()
                .collect(Collectors.toMap(a -> a.getSex(), a -> a));


    }

    @Override
    public Map<Integer, Student> listStudentsByYearMapById(int year) {
        return null;
    }

    @Override
    public boolean removeStudent(int id) {
        return false;
    }
}
