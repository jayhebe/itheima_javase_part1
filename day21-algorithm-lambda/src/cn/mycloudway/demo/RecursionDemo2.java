package cn.mycloudway.demo;

public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
