package cn.mycloudway.test;

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.next();
        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseStr)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }
}
