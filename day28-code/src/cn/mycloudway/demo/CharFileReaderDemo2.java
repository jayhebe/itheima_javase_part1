package cn.mycloudway.demo;

import java.io.FileReader;
import java.io.IOException;

public class CharFileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28-code/text.txt");

        int len;
        char[] chars = new char[20];
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        fr.close();
    }
}
