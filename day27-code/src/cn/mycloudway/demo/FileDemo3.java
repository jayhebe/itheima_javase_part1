package cn.mycloudway.demo;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File f1 = new File("D:\\aaa\\a.txt");
        System.out.println(f1.length());

        File f2 = new File("D:\\aaa\\bbb");
        System.out.println(f2.length());

        File f3 = new File("D:\\aaa\\a.txt");
        System.out.println(f3.getAbsolutePath());

        File f4 = new File("day27-code\\a.txt");
        System.out.println(f4.getAbsolutePath());

        File f5 = new File("D:\\aaa\\a.txt");
        System.out.println(f5.getPath());

        File f6 = new File("day27-code\\a.txt");
        System.out.println(f6.getPath());

        File f7 = new File("D:\\aaa\\a.txt");
        System.out.println(f7.getName());

        File f8 = new File("D:\\aaa\\bbb");
        System.out.println(f8.getName());
    }
}
