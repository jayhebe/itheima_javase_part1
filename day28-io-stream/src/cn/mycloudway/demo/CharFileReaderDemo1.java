package cn.mycloudway.demo;

import java.io.FileReader;
import java.io.IOException;

public class CharFileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28-code/text.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
