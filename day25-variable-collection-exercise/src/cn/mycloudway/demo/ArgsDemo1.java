package cn.mycloudway.demo;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(10, 20));
        System.out.println(getSum(10, 20, 30));
        System.out.println(getSum(10, 20, 30, 40));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
