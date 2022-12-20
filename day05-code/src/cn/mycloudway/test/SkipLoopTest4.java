package cn.mycloudway.test;

import java.util.Random;
import java.util.Scanner;

public class SkipLoopTest4 {
    public static void main(String[] args) {
        boolean flag = true;
        int count = 1;
        int times = 10;
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (flag && count <= times) {
            System.out.print("Please guess a number: ");
            int guess = scanner.nextInt();

            if (guess == answer) {
                flag = false;
                System.out.println("Yes, you are right!!!");
            } else {
                count++;
                if (guess > answer) {
                    System.out.println("No, it is bigger than answer.");
                } else {
                    System.out.println("No, it is smaller than answer.");
                }
            }
        }

        if (count > times) {
            System.out.println("The correct answer is " + answer);
        }
    }
}
