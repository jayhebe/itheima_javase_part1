package cn.mycloudway.test;

import java.util.Scanner;
public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("The sum is " + (a + b));
    }
}
