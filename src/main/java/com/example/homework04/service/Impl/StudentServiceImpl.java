package com.example.homework04.service.Impl;

import com.example.homework04.entity.Student;
import com.example.homework04.service.StudentService;

import java.util.*;
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
        Map<Student.Sex, List<Student>>map;
        map = listStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getSex));
        return map;
    }

    @Override
    public Map<Integer, List<Student>> listStudentsByYearMapById(int year) {
        Map<Integer, List<Student>> map ;
        map = listStudents()
                .stream()
                .filter(a -> a.getYear() == year)
                .collect(Collectors.groupingBy(Student::getId));
        return map;
    }

    @Override
    public boolean removeStudent(int id) {
        //listStudents().removeIf(stu -> stu.getId() == id);
       Iterator<Student>studentIterator = listStudents().iterator();
       int flag = 0;
        while(studentIterator.hasNext()){
            Student stu = studentIterator.next();
            if(stu.getId() == id){
                studentIterator.remove();
                flag = 1;
            }
        }
        if(flag == 0){
            return false;//没有移除
        }else {
            return true;//移除成功
        }
    }
}
