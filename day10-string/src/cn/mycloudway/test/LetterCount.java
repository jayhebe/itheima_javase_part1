package cn.mycloudway.test;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.next();
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;

        for (int i = 0; i < str.length(); i++) {
            byte b = (byte)str.charAt(i);
            if (b >= 48 && b <= 57) {
                countDigit++;
            } else if (b >= 65 && b <= 90) {
                countUpper++;
            } else if (b >= 97 && b <= 122) {
                countLower++;
            }
        }

        System.out.println("字符串含有大写字母" + countUpper + "个，小写字母" + countLower + "，数字" + countDigit + "个");
    }
}
