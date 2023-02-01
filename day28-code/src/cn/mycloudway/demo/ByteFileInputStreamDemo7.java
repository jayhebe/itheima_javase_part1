package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteFileInputStreamDemo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28-code/e.txt");

        int len;
        byte[] bytes = new byte[5];
        while ((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len, StandardCharsets.UTF_8));
        }
    }
}
