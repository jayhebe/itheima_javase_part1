package cn.mycloudway.demo;

public class SystemDemo2 {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            isPrime1(i);
        }
        long time2 = System.currentTimeMillis();

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            isPrime2(i);
        }
        long time4 = System.currentTimeMillis();

        System.out.println(time2 - time1);
        System.out.println(time4 - time3);
    }

    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
