package cn.mycloudway.demo;

public class MethodDemo5 {
    public static void main(String[] args) {
        // System.out.println(getSum(10, 20, 30));
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(20, 30 ,40);
        int sum3 = getSum(20, 30, 40);
        int sum4 = getSum(20, 30 ,40);

        System.out.println(sum1 + sum2 + sum3 + sum4);
    }

    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
