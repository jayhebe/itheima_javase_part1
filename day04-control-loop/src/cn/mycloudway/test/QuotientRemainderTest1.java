package cn.mycloudway.test;

import java.util.Scanner;

public class QuotientRemainderTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Please enter the divisor: ");
        int divisor = scanner.nextInt();

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient += 1;
        }

        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + dividend);
    }
}
