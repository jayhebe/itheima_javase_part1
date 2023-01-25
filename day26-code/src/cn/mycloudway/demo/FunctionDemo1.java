package cn.mycloudway.demo;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 6, 2};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------");

        Arrays.sort(arr, (i1, i2) -> i2 - i1);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------");

        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
