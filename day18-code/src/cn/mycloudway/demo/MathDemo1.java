package cn.mycloudway.demo;

public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        System.out.println(Math.abs(-2147483648));
        System.out.println("------------------------------------------");

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.54));

        System.out.println("------------------------------------------");

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.54));

        System.out.println("------------------------------------------");

        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        System.out.println("------------------------------------------");

        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(20, 30));

        System.out.println("------------------------------------------");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2, -2));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));

        System.out.println("------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.ceil(Math.random() * 100) + 1);
        }
    }
}
