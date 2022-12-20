package cn.mycloudway.demo;

public class MethodDemo4 {
    public static void main(String[] args) {
        getSum(10, 20);
        getSum(20, 30);
        getSum(30, 40);
    }

    public static void getSum(int a, int b) {
        System.out.println(a + b);
    }
}
