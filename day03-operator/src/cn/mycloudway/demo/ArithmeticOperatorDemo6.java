package cn.mycloudway.demo;

public class ArithmeticOperatorDemo6 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        int z = ++x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
