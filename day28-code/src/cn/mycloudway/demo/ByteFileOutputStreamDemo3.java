package cn.mycloudway.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day28-code/b.txt");

        byte[] b = {97, 98, 99, 100, 101};
        fos.write(b, 2, 2);
        fos.close();
    }
}
