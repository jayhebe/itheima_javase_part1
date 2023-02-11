package cn.mycloudway.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("day27-code\\bbb.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D:\\aaa\\bbb");
        System.out.println(f2.mkdir());

        File f3 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdir());

        File f4 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        System.out.println(f4.mkdirs());
    }
}
