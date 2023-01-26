package cn.mycloudway.demo;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("D:\\aaa\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println("-------------------------------------");

        File f2 = new File("D:\\aaa\\bbb");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        System.out.println("-------------------------------------");

        File f3 = new File("D:\\aaa\\c.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
