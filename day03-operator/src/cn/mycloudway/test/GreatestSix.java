package cn.mycloudway.test;

import java.util.Scanner;

public class GreatestSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Please enter the another number: ");
        int b = scanner.nextInt();

        if (a == 6 || b == 6 || (a + b) % 6 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
