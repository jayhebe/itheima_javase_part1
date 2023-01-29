package cn.mycloudway.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CodeCounter {
    public static void main(String[] args) {
        String path = ".";
        String ext = ".java";
        ArrayList<File> javaFiles = getAllFiles(path, ext);
        HashMap<String, Integer> result = countCodeLines(javaFiles);

        System.out.println(result);
    }

    public static ArrayList<File> getAllFiles(String path, String ext) {
        ArrayList<File> result = new ArrayList<>();
        File file = new File(path);
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                result.addAll(getAllFiles(f.getPath(), ext));
            } else {
                if (f.getPath().endsWith(ext)) {
                    result.add(f);
                }
            }
        }

        return result;
    }

    public static HashMap<String, Integer> countCodeLines(ArrayList<File> files) {
        int sum = 0;
        FileInputStream fis = null;
        HashMap<String, Integer> result = new HashMap<>();

        for (File file : files) {
            try {
                fis = new FileInputStream(file);

                while (fis.available() != 0) {
                    if ((char) fis.read() == '\r' && (char) fis.read() == '\n') {
                        sum++;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("文件" + file + "未找到");
            } catch (IOException e) {
                System.out.println("文件" + file + "读取错误");
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        result.put("lines", sum);
        result.put("files", files.size());

        return result;
    }
}
