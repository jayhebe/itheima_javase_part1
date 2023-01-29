package cn.mycloudway.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28-code/a.txt");

        /*
        while (fis.available() != 0) {
            System.out.print((char) fis.read());
        }
        */
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }

        fis.close();
    }
}
