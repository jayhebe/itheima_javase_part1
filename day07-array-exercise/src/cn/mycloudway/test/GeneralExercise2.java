package cn.mycloudway.test;

public class GeneralExercise2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200 ; i++) {
            if (isPrimeNumber(i)) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("There are " + count + " prime numbers in total.");
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
