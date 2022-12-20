package cn.mycloudway.demo;

public class LogicOperatorDemo3 {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);

        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
