package cn.mycloudway.test;

import java.util.Scanner;

public class PalindromicNumberTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();

        String strNumber = Integer.toString(number);
        StringBuilder revNumber = new StringBuilder(strNumber);

        if (strNumber.equalsIgnoreCase(revNumber.reverse().toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
