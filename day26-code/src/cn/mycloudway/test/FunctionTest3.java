package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTest3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        Collections.addAll(students, s1, s2, s3);

        String[] info = students.stream()
                .map(new Student()::concat)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(info));
    }
}
