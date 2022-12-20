package cn.mycloudway.demo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int a = scanner.nextInt();
        System.out.println("Your input is " + a);
    }
}
