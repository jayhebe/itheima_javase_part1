package cn.mycloudway.demo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        System.out.print("想吃哪种面呢？：");

        Scanner scanner = new Scanner(System.in);
        String noodle = scanner.next();

        switch (noodle) {
            case "炸酱面":
            case "油泼面":
            case "海鲜面":
                System.out.println("吃" + noodle);
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
