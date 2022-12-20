package cn.mycloudway.test;

import java.util.Scanner;

public class ForTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        int start = -1;
        int end = -1;
        while (flag) {
            System.out.print("Please enter the start number: ");
            start = scanner.nextInt();

            System.out.print("Please enter the end number: ");
            end = scanner.nextInt();

            if (start > end) {
                continue;
            } else {
                flag = false;
            }
        }

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //System.out.println(i);
                count++;
            }
        }

        System.out.println("The total number is " + count);
    }
}
