package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileInputStreamDemo5 {
    public static void main(String[] args) throws FileNotFoundException {
        String srcPath = "day28-code/a.txt";
        String destPath = "day28-code/d.txt";

        copyFile(srcPath, destPath);
    }

    public static void copyFile(String srcPath, String destPath) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(destPath);

        try(fis;fos) {
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
