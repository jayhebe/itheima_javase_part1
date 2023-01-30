package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileInputStreamDemo4 {
    public static void main(String[] args) {
        String srcPath = "day28-code/a.txt";
        String destPath = "day28-code/d.txt";

        copyFile(srcPath, destPath);
    }

    public static void copyFile(String srcPath, String destPath) {
        try(FileInputStream fis = new FileInputStream(srcPath);
            FileOutputStream fos = new FileOutputStream(destPath)) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            System.out.println("文件读取失败");
        }
    }
}
