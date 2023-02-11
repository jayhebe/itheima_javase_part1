package cn.mycloudway.test;

import java.util.ArrayList;

public class BasicSearchTest2 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 82;
        System.out.println(basicSearch(arr, number));
    }

    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result.add(i);
            }
        }

        return result;
    }
}
