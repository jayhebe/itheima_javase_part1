package cn.mycloudway.demo;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28-code/out.txt");

        fw.write(25105);
        fw.close();
    }
}
