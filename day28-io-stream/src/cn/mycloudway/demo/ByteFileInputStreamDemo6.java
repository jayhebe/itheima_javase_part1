package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamDemo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28-code/e.txt");

        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
