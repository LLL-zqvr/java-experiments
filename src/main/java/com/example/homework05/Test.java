package com.example.homework05;
import com.example.homework05.entity.College;
import com.example.homework05.entity.Teacher;
import com.example.homework05.resource.DatabaseUtils;
import com.example.homework05.entity.Student;
import static com.example.homework05.resource.DatabaseUtils.studentslist;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        College college = new College("土木");
        Teacher teacher = new Teacher("1","keven", college );
        Student student = new Student("1", "mm", teacher, "2000");
        List<Student>list = new ArrayList<>();
        list = studentslist();
       String name = getCollegeName(list.get(1));
        System.out.println(name);
        name = getCollegeName(list, "2222");
        System.out.println(name);

    }
    //基于给定学生，获取学生的导师所在的学院名称
    //不存在或失败则返回未知学院
    private static String getCollegeName(Student student){
      return Optional.ofNullable(student)
              .map(Student::getTeacher)
              .map(Teacher::getCollege)
              .map(College::getName)
              .orElse("未知学院");


    }
    //基于给定学生及教师姓名，判断是否为给定学生的指导教师
    //不匹配或者不存在都返回false
    private static boolean isTeacher(Student student, String teacherName){
        return Optional.ofNullable(student)
                .map(Student::getTeacher)
                .filter(a -> a.getName().equals(teacherName))
                .isPresent();

    }
    /*
  基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
  任何一项不存在或失败，返回 未知学院
  结合collection stream findFirst()方法实现
  可直接通过一条方法链实现
     */
    private static String getCollegeName(List<Student> students, String sNumber){
       return  students.stream()
               .findFirst()
               .filter(a -> a.getId().equals(sNumber))
               .map(Student::getTeacher)
               .map(Teacher::getCollege)
               .map(College::getName)
               .orElse("未知学院");
    }
    /*
    实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
    任何一项不存在或失败，打印显式 未知学院
      结合collection stream findFirst()方法实现
      可直接通过一条方法链实现

     */
    private static void printCollegeName(List<Student> students, String sNumber, String  tNumber){
        System.out.println(
                students.stream()
                .findFirst()
                .filter(a -> a.getId().equals(sNumber))
                .map(Student::getTeacher)
                .filter(a -> a.getId().equals(tNumber))
                .map(Teacher::getCollege)
                .map(College::getName)
                        .orElse("未知学院")
        );


    }

}
