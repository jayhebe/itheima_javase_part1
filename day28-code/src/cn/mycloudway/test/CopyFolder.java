package cn.mycloudway.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyFolder {
    public static void main(String[] args) throws IOException {
        String srcPath = "";
        String destPath = "";

        copyAllFiles(srcPath, destPath);
    }

    public static void copyAllFiles(String srcPath, String destPath) throws IOException {
        String[] folders = srcPath.split("\\\\");
        String srcFolder = folders[folders.length - 1];

        ArrayList<File> allFiles = listAllFiles(srcPath);
        for (File f : allFiles) {
            String destFolder = destPath + "\\" + f.getParent().replace(srcPath, srcFolder);
            File file = new File(destFolder);
            if (! file.exists()) {
                file.mkdirs();
            }

            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(destFolder + "\\" + f.getName());

            fos.write(fis.readAllBytes());

            fos.close();
            fis.close();
        }
    }

    public static ArrayList<File> listAllFiles(String path) {
        ArrayList<File> allFiles = new ArrayList<>();
        File file = new File(path);
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                allFiles.addAll(listAllFiles(f.getPath()));
            } else {
                allFiles.add(f);
            }
        }

        return allFiles;
    }
}
