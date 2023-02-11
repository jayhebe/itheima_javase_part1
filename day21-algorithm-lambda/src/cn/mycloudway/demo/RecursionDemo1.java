package cn.mycloudway.demo;

public class RecursionDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }

    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }

        return number + getSum(number - 1);
    }
}
