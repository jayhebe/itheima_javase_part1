package cn.mycloudway.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("day29-code/day01-code.zip");
        File dest = new File("D:\\");

        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int len;
                byte[] bytes = new byte[8192];
                while ((len = zip.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }

                fos.close();
                zip.closeEntry();
            }
        }

        zip.close();
    }
}
