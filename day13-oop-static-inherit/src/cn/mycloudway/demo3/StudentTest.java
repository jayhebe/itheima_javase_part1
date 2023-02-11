package cn.mycloudway.demo3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("zhangsan", 18, "男");
        Student s2 = new Student("lisi", 16, "女");
        Student s3 = new Student("wangwu", 24, "男");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println(StudentUtil.getOldestStudent(studentList));
    }
}
