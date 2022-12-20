package cn.mycloudway.test;

import java.util.Scanner;

public class IfElseTest2 {
    public static void main(String[] args) {
        int totalCost = 600;

        System.out.print("Please enter the payment: ");
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();

        if (cost >= totalCost) {
            System.out.println("Payment approved.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
