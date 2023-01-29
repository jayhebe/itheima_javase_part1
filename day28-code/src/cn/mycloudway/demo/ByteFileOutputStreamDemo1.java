package cn.mycloudway.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day28-code/a.txt");
        fos.write(97);
        fos.close();
    }
}
