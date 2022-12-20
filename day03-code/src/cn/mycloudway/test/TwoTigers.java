package cn.mycloudway.test;

import java.util.Scanner;

public class TwoTigers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the weight of the first tiger: ");
        int tiger1 = scanner.nextInt();

        System.out.print("Please enter the weight of the second tiger: ");
        int tiger2 = scanner.nextInt();

        System.out.println(tiger1 == tiger2 ? "相同" : "不同");
    }
}
