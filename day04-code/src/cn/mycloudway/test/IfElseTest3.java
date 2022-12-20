package cn.mycloudway.test;

import java.util.Scanner;

public class IfElseTest3 {
    public static void main(String[] args) {
        System.out.print("Please enter the ticket number (1 - 100): ");

        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();

        if (ticketNumber >= 0 && ticketNumber <=100) {
            if (ticketNumber % 2 == 0) {
                System.out.println("Seat on the right.");
            } else {
                System.out.println("Seat on the left.");
            }
        } else {
            System.out.println("Ticket number is invalid.");
        }
    }
}
