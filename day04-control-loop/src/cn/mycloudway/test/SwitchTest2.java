package cn.mycloudway.test;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        System.out.print("Please enter the day of a week (1 - 7): ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        /*
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("The day is invalid.");
                break;
        }
        */

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("The day is invalid.");
        }
    }
}
