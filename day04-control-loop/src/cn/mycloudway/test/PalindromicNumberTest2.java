package cn.mycloudway.test;

import java.util.Scanner;

public class PalindromicNumberTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();

        int reverseNumber = 0;
        int temp = number;
        while (temp != 0) {
            int n = temp % 10;
            temp /= 10;
            reverseNumber = reverseNumber * 10 + n;
        }

        if (reverseNumber == number) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
