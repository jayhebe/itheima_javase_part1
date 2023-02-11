package cn.mycloudway.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("day29-code/printWriter.txt"), true);

        pw.println("今天你终于叫我名字了，虽然叫错了，但是没关系，我马上改");
        pw.print("你好好");
        pw.printf("%s爱上了%s", "阿珍", "阿强");
        pw.close();
    }
}
