package cn.mycloudway.demo;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        Arrays.sort(arr, (Integer o1, Integer o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
