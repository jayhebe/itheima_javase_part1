package cn.mycloudway.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEncryption {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "day28-code/text.txt";
        String encryptedFilePath = "day28-code/encrypt.txt";
        String decryptedFilePath = "day28-code/decrypt.txt";

        encrypt(srcFilePath, encryptedFilePath);
        decrypt(encryptedFilePath, decryptedFilePath);
    }

    public static void encrypt(String srcFilePath, String encryptedFilePath) throws IOException {
        FileInputStream fis = new FileInputStream(srcFilePath);
        FileOutputStream fos = new FileOutputStream(encryptedFilePath);

        int i;
        while ((i = fis.read()) != -1) {
            byte b = (byte) (i + 1);
            fos.write(b);
        }

        fos.close();
        fis.close();
    }

    public static void decrypt(String encryptedFilePath, String decryptedFilePath) throws IOException {
        FileInputStream fis = new FileInputStream(encryptedFilePath);
        FileOutputStream fos = new FileOutputStream(decryptedFilePath);

        int i;
        while ((i = fis.read()) != -1) {
            byte b = (byte) (i - 1);
            fos.write(b);
        }

        fos.close();
        fis.close();
    }
}
