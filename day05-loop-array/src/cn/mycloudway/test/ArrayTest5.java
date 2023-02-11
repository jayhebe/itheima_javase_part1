package cn.mycloudway.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }

        for (int j : arr) {
            System.out.println(j);
        }

        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        System.out.println("The sum of the array is " + sum);

        double mean = (double)sum / arr.length;
        System.out.println("The mean of the array is " + mean);

        int count = 0;
        for (int m : arr) {
            if (m < mean) {
                count++;
            }
        }
        System.out.println("There is(are) " + count + " value(s) smaller than mean.");
    }
}
