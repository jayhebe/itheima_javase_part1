package cn.mycloudway.test;

import java.io.File;

public class FIleTest4 {
    public static void main(String[] args) {
        deleteAllFiles("day27-code\\bbb");
    }

    public static void deleteAllFiles(String path) {
        File f = new File(path);
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                deleteAllFiles(file.getPath());
            } else {
                System.out.println(file.delete());
            }
        }

        System.out.println(f.delete());
    }
}
