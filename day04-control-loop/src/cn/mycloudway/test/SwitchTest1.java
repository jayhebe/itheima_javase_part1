package cn.mycloudway.test;

import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args) {
        System.out.print("Please enter the day in a week (1 - 7): ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        /*
        switch (day) {
            case 1:
                System.out.println("Monday: Running");
                break;
            case 2:
                System.out.println("Tuesday: Swimming");
                break;
            case 3:
                System.out.println("Wednesday: Walking");
                break;
            case 4:
                System.out.println("Thursday: Spinning");
                break;
            case 5:
                System.out.println("Friday: Boxing");
                break;
            case 6:
                System.out.println("Saturday: Climbing");
                break;
            case 7:
                System.out.println("Sunday: Eating");
                break;
            default:
                System.out.println("The day is invalid.");
                break;
        }
        */

        //JDK 12特性，如果case体只有一个语句，大括号也可省略
        switch (day) {
            case 1 -> System.out.println("Monday: Running");
            case 2 -> System.out.println("Tuesday: Swimming");
            case 3 -> System.out.println("Wednesday: Walking");
            case 4 -> System.out.println("Thursday: Spinning");
            case 5 -> System.out.println("Friday: Boxing");
            case 6 -> System.out.println("Saturday: Climbing");
            case 7 -> System.out.println("Sunday: Eating");
            default -> System.out.println("The day is invalid.");
        }
    }
}
