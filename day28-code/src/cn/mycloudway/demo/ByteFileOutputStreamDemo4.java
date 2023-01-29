package cn.mycloudway.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileOutputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day28-code/c.txt", true);

        String str = "hello world";
        fos.write(str.getBytes());
        fos.close();
    }
}
