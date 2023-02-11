package cn.mycloudway.test;

import java.io.File;
import java.util.Arrays;

public class FileTest2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFiles("day27-code\\aaa", ".txt")));
    }

    public static File[] findFiles(String folder, String ext) {
        File file = new File(folder);

        return file.listFiles(pathname -> pathname.getPath().endsWith(ext));
    }
}
