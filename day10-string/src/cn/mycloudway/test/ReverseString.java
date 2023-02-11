package cn.mycloudway.test;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.next();
        System.out.println("反转后的字符串：" + reverse(str));
    }

    public static String reverse(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(str.length() - 1 - i);
        }

        return new String(chars);
    }
}
