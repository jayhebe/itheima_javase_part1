package cn.mycloudway.test;

import java.util.Scanner;

public class RomaChars {
    public static void main(String[] args) {
        String[] romas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int input = scanner.nextInt();

        while (true) {
            int unit = input % 10;
            result = romas[unit] + result;
            input /= 10;
            if (input == 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
