package cn.mycloudway.test;

import java.util.Scanner;

public class GeneralExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the original ticket price: ");
        double oriPrice = scanner.nextDouble();
        System.out.print("Please enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Please enter the class type (first or economy): ");
        String classType = scanner.next();

        System.out.println("The final ticket price is " + calcTicketPrice(oriPrice, month, classType));
    }

    public static double calcTicketPrice(double oriPrice, int month, String classType) {
        double discount = 0;
        switch (month) {
            case 5, 6, 7, 8, 9, 10 -> {
                if (classType.equals("first")) {
                    discount = 0.9;
                } else {
                    discount = 0.85;
                }
            }
            case 1, 2, 3, 4, 11, 12 -> {
                if (classType.equals("first")) {
                    discount = 0.7;
                } else {
                    discount = 0.65;
                }
            }
        }

        return oriPrice * discount;
    }
}
