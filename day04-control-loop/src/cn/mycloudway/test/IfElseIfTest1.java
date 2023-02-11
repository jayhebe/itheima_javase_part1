package cn.mycloudway.test;

import java.util.Scanner;

public class IfElseIfTest1 {
    public static void main(String[] args) {
        System.out.print("Please enter the score: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("Bicycle");
            } else if (score >= 90 && score <= 94) {
                System.out.println("Amusement park");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Transformer");
            } else {
                System.out.println("Get a thrashing");
            }
        } else {
            System.out.println("The score is invalid.");
        }
    }
}
