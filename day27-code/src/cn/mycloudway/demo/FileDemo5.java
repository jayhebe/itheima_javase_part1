package cn.mycloudway.demo;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f1 = new File("day27-code\\bbb.txt");
        System.out.println(f1.delete());
    }
}
