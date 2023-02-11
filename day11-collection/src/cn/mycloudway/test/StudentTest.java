package cn.mycloudway.test;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Jay", 18));
        list.add(new Student("Sherry", 16));

        System.out.println(list);
    }
}
