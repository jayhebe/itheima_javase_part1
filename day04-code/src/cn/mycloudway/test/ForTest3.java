package cn.mycloudway.test;

import java.util.Scanner;

public class ForTest3 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("The sum from 1 to " + number + " is " + sum);
    }
}
