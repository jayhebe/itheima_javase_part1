package cn.mycloudway.test;

import java.util.Scanner;

public class IfElseIfTest2 {
    public static void main(String[] args) {
        int cost = 1000;

        System.out.print("Please enter the VIP level (1 - 3): ");
        Scanner scanner = new Scanner(System.in);
        int vipLevel = scanner.nextInt();

        if (vipLevel >= 0 && vipLevel <= 3) {
            if (vipLevel == 1) {
                System.out.println("The cost is " + cost * 0.9);
            } else if (vipLevel == 2) {
                System.out.println("The cost is " + cost * 0.8);
            } else if (vipLevel == 3) {
                System.out.println("The cost is " + cost * 0.7);
            } else {
                System.out.println("The cost is " + cost);
            }
        } else {
            System.out.println("The VIP level is invalid.");
        }
    }
}
