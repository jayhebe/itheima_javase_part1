package cn.mycloudway.test;

import java.util.Scanner;

public class SwitchTest3 {
    public static void main(String[] args) {
        System.out.print("Please press a button: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
