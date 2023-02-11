package cn.mycloudway.test;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
