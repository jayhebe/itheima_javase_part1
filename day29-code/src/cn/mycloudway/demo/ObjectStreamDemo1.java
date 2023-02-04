package cn.mycloudway.demo;

import java.io.*;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29-code/student.txt"));

        oos.writeObject(new Student("zhangsan", 23));
        oos.close();
    }
}
