package cn.mycloudway.test;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28-code/a.txt");

        byte[] bytes = new byte[2];

        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
    }
}
