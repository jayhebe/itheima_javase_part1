package cn.mycloudway.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("day29-code/out.txt"));

        ps.println(97);
        ps.print(true);
        ps.printf("%s 爱上了 %s", "阿珍", "阿强");
        ps.close();
    }
}
