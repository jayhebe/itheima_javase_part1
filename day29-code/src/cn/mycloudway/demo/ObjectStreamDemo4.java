package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectStreamDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29-code/list.txt"));

        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
