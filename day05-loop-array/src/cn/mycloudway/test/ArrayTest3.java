package cn.mycloudway.test;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] *= 2;
            } else {
                arr[i] /= 2 ;
            }
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
