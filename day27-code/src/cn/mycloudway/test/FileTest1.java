package cn.mycloudway.test;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File folder = new File("day27-code\\aaa");
        System.out.println(folder.mkdir());

        File file = new File(folder.getPath(), "a.txt");
        System.out.println(file.createNewFile());
    }
}
