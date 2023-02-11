package cn.mycloudway.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29-code/list.txt"));

        Student s1 = new Student("zhangsan", 23, "天津");
        Student s2 = new Student("lisi", 24, "上海");
        Student s3 = new Student("wangwu", 25, "北京");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        oos.writeObject(students);
        oos.close();
    }
}
