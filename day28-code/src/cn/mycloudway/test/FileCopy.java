package cn.mycloudway.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcPath = "day28-code/a.txt";
        String destPath = "day28-code/d.txt";

        try {
            copyFile(srcPath, destPath);
        } catch (IOException e) {
            System.out.println("文件拷贝失败");
            e.printStackTrace();
        }
    }

    public static void copyFile(String srcPath, String destPath) throws IOException {
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(destPath);

        fos.write(fis.readAllBytes());

        fos.close();
        fis.close();
    }
}
