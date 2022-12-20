package cn.mycloudway.test;

import java.util.Scanner;

public class IfElseTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入身上带的钱：");
        int money = scanner.nextInt();

        if (money >= 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃沙县小吃");
        }
    }
}
