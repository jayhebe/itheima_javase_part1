package cn.mycloudway.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src = new File("day29-code");
        File dest = new File(src.getParent(), src.getName() + ".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        toZip(src, dest, zos);
        zos.close();
    }

    public static void toZip(File src, File dest, ZipOutputStream zos) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                toZip(file, dest, zos);
            } else {
                FileInputStream fis = new FileInputStream(file);
                ZipEntry entry = new ZipEntry(src.getPath() + "\\" + file.getName());
                zos.putNextEntry(entry);

                int len;
                byte[] bytes = new byte[8192];
                while ((len = fis.read(bytes)) != -1) {
                    zos.write(bytes, 0, len);
                }

                fis.close();
                zos.closeEntry();
            }
        }
    }
}
