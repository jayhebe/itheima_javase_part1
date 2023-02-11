package cn.mycloudway.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class FileTest5 {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<>();
        listAllFiles("day27-code", files);
        HashMap<String, Integer> fileInfo = countFile(files);

        fileInfo.forEach((ext, number) -> System.out.println(ext + ":" + number + "个"));
    }

    public static void listAllFiles(String path, ArrayList<File> allFiles) {
        File f = new File(path);
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                listAllFiles(file.getPath(), allFiles);
            } else {
                allFiles.add(file);
            }
        }
    }

    public static HashMap<String, Integer> countFile(ArrayList<File> files) {
        HashMap<String, Integer> result = new HashMap<>();

        for (File file : files) {
            String ext = file.getPath().split("\\.")[1];
            result.put(ext, result.getOrDefault(ext, 0));
            result.put(ext, result.get(ext) + 1);
        }

        return result;
    }
}
