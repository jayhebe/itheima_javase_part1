package cn.mycloudway.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29-code/write.txt"));

        bw.write("我想就这样牵着你的手不放开");
        bw.newLine();
        bw.write("爱能不能够永远单纯没有悲哀");

        bw.close();
    }
}
