package cn.mycloudway.demo;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        listAllFiles("day27-code");
    }

    public static void listAllFiles(String path) {
        File f = new File(path);
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                listAllFiles(file.getPath());
            } else {
                System.out.println(file);
            }
        }
    }
}
