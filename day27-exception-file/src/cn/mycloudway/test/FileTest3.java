package cn.mycloudway.test;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        listAllFiles("day27-code", ".java");
    }

    public static void listAllFiles(String path, String ext) {
        File f = new File(path);
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                listAllFiles(file.getPath(), ext);
            } else {
                if (file.getPath().endsWith(ext)) {
                    System.out.println(file);
                }
            }
        }
    }
}
