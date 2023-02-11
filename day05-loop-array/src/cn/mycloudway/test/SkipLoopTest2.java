package cn.mycloudway.test;

import java.util.Scanner;

public class SkipLoopTest2 {
    public static void main(String[] args) {
        System.out.print("Please enter an integer larger than 2: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (i * i <= number && (i + 1) * (i + 1) > number) {
                System.out.println(i);
                break;
            }
        }
    }
}
