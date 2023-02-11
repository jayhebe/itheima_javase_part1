package cn.mycloudway.test;

import java.util.Scanner;

public class GeneralTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入任意1-10位数字：");
        String str = scanner.nextLine();
        System.out.println(parseInt(str));
        System.out.println(parseInt(str) + 1);
        System.out.println(Integer.parseInt("-1"));
    }

    public static int parseInt(String str) {
        if (str.startsWith("0")) {
            return -1;
        }

        if (str.length() < 1 || str.length() > 10) {
            return -1;
        }

        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c <= '0' || c >= '9') {
                return -1;
            }
        }

        int sum = 0;
        for (char c : chars) {
            sum = sum * 10 + (c - 48);
        }

        return sum;
    }
}
