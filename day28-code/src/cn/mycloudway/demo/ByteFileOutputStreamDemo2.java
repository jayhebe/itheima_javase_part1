package cn.mycloudway.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day28-code/a.txt");

        byte[] b = {97, 98, 99, 100, 101};
        fos.write(b);
        fos.close();
    }
}
