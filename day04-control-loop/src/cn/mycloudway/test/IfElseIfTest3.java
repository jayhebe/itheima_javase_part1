package cn.mycloudway.test;

public class IfElseIfTest3 {
    public static void main(String[] args) {
        boolean isLightRed = false;
        boolean isLightYellow = false;
        boolean isLightGreen = true;

        if (isLightRed) {
            System.out.println("Stop!");
        } else if (isLightYellow) {
            System.out.println("Slow down...");
        } else if (isLightGreen) {
            System.out.println("Go go go!!!");
        }
    }
}
