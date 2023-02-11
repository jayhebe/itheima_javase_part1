package cn.mycloudway.demo;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr2 = {"a", "b", "c"};

        Arrays.stream(arr1).forEach(i -> System.out.println(i));
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
