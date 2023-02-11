package cn.mycloudway.test;

import java.util.Scanner;

public class LoopString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i) + " ");
        }
    }
}
