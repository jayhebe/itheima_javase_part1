package cn.mycloudway.demo;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28-code/out2.txt");

        fw.write("你这瓜保熟吗???");
        fw.close();
    }
}
