package cn.mycloudway.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day29-code/b.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("day29-code/utf8.txt", Charset.forName("UTF8"));

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }
}
