package cn.mycloudway.test;

import java.io.*;
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
        BufferedReader br = null;
        HashMap<String, Integer> result = new HashMap<>();

        for (File file : files) {
            try {
                br = new BufferedReader(new FileReader(file));

                while (br.readLine() != null) {
                    sum++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("文件" + file + "未找到");
            } catch (IOException e) {
                System.out.println("文件" + file + "读取错误");
            } finally {
                try {
                    br.close();
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
