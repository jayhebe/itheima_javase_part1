package cn.mycloudway.demo;

import java.io.FileReader;
import java.io.IOException;

public class CharFileReaderDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28-code/b.txt");

        int b1 = fr.read();
        System.out.println(b1);

        int b2 = fr.read();
        System.out.println(b2);

        int b3 = fr.read();
        System.out.println(b3);
    }
}
