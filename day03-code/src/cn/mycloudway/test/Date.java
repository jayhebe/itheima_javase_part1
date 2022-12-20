package cn.mycloudway.test;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int yourFashionValue = Date.getFashionValue("your");
        int theGirlsFashionValue = Date.getFashionValue("the girl's");

        if (yourFashionValue > theGirlsFashionValue) {
            System.out.println("You win!!!");
        } else {
            System.out.println("You lose...");
        }
    }

    public static int getFashionValue(String who) {
        int value = -1;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.print("Please enter " + who + " fashion value: ");
            value = scanner.nextInt();
            if (value > 10 || value < 0) {
                continue;
            } else {
                flag = false;
            }
        }

        return value;
    }
}
