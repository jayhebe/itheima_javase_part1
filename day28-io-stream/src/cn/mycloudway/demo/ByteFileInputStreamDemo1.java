package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28-code/a.txt");

        System.out.println(fis.read());

        fis.close();
    }
}
