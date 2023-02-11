package cn.mycloudway.demo;

public class ArgsDemo3 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5));
    }

    public static int getSum(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        return sum;
    }
}
