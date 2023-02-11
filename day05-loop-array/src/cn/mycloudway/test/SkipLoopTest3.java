package cn.mycloudway.test;

import java.util.Scanner;

public class SkipLoopTest3 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = true;

        /*
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
