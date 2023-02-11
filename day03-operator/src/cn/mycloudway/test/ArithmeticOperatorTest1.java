package cn.mycloudway.test;

import java.util.Scanner;

public class ArithmeticOperatorTest1 {
    public static void main(String[] args) {
        int number = -1;
        boolean flag = true;
        while (flag) {
            System.out.print("Please enter a 3-digits number: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if (number < 100 || number > 999) {
                continue;
            } else {
                flag = false;
            }
        }

        /*
        int hundredsDigit = number / 100;
        int tensDigit = number % 100 / 10;
        int unitsDigit = number % 100 % 10;
         */

        int hundredsDigit = number / 100 % 10;
        int tensDigit = number / 10 % 10;
        int unitsDigit = number % 10;

        System.out.println("The hundreds-digit is " + hundredsDigit);
        System.out.println("The tens-digit is " + tensDigit);
        System.out.println("The units-digit is " + unitsDigit);
    }
}
