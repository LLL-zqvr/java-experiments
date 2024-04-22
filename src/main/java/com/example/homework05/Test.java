package com.example.homework05;

import com.example.homework05.entity.Student;

import java.util.List;

public class Test {
    public static void main(String[] args) {


    }
    //基于给定学生，获取学生的导师所在的学院名称
    //不存在或失败则返回未知学院
    private static String getCollegeName(Student student){
        return "未知学院";
    }
    //基于给定学生及教师姓名，判断是否为给定学生的指导教师
    //不匹配或者不存在都返回false
    private static boolean isTeacher(Student student, String teacherName){
        return false;
    }
    /*
  基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
  任何一项不存在或失败，返回 未知学院
  结合collection stream findFirst()方法实现
  可直接通过一条方法链实现
     */
    private static String getCollegeName(List<Student> students, int sNumber){
        return "未知学院";
    }
    /*
    实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
    任何一项不存在或失败，打印显式 未知学院
      结合collection stream findFirst()方法实现
      可直接通过一条方法链实现

     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {

    }

}
