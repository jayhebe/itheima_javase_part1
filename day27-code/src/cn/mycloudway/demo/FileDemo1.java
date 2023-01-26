package cn.mycloudway.demo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String path = "C:\\test\\Student.java";
        File file1 = new File(path);
        System.out.println(file1);

        String parent = "C:\\test";
        String child = "Student.java";
        File file2 = new File(parent, child);
        System.out.println(file2);
    }
}
