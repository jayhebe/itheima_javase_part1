package cn.mycloudway.test;

import java.io.*;

public class CopyTest1 {
    public static void main(String[] args) throws IOException {
        String src = "day29-code/jdk-17.0.5_doc-all.zip";
        String inputDest1 = "day29-code/inputCopy1.zip";
        String inputDest2 = "day29-code/inputCopy2.zip";
        String bufferedDest1 = "day29-code/bufferedCopy1.zip";
        String bufferedDest2 = "day29-code/bufferedCopy2.zip";

        long inputStart1 = System.currentTimeMillis();
        inputStreamCopy1(src, inputDest1);
        long inputEnd1 = System.currentTimeMillis();
        System.out.println("Input Stream1: " + (inputEnd1 - inputStart1));

        long inputStart2 = System.currentTimeMillis();
        inputStreamCopy2(src, inputDest2);
        long inputEnd2 = System.currentTimeMillis();
        System.out.println("Input Stream2: " + (inputEnd2 - inputStart2));

        long bufferedStart1 = System.currentTimeMillis();
        bufferedStreamCopy1(src, bufferedDest1);
        long bufferedEnd1 = System.currentTimeMillis();
        System.out.println("Buffered Stream1: " + (bufferedEnd1 - bufferedStart1));

        long bufferedStart2 = System.currentTimeMillis();
        bufferedStreamCopy2(src, bufferedDest2);
        long bufferedEnd2 = System.currentTimeMillis();
        System.out.println("Buffered Stream2: " + (bufferedEnd2 - bufferedStart2));

        //Input Stream1: 163296
        //Input Stream2: 234
        //Buffered Stream1: 1562
        //Buffered Stream2: 79
    }

    public static void inputStreamCopy1(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }

        fos.close();
        fis.close();
    }

    public static void inputStreamCopy2(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }

    public static void bufferedStreamCopy1(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        int i;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }

        bos.close();
        bis.close();
    }

    public static void bufferedStreamCopy2(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }
}
