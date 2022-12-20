package cn.mycloudway.test;

public class IfTest2 {
    public static void main(String[] args) {
        boolean isLightRed = true;
        boolean isLightYellow = false;
        boolean isLightGreen = false;

        if (isLightRed) {
            System.out.println("Stop!");
        }

        if (isLightYellow) {
            System.out.println("Slow down...");
        }

        if (isLightGreen) {
            System.out.println("Go go go!!!");
        }
    }
}
