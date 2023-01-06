package cn.mycloudway.demo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());

        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        System.out.println(r1 == r2);
        System.out.println(rt.maxMemory() / 1024 / 1024);
        System.out.println(rt.totalMemory() / 1024 / 1024);
        System.out.println(rt.freeMemory() / 1024 / 1024);

        //rt.exec("shutdown -a");
    }
}
