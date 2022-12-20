package cn.mycloudway.demo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        System.out.print("请输入女婿酒量：");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value > 2) {
            System.out.println("小伙子不错！");
        }
    }
}
