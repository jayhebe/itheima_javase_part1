package cn.mycloudway.demo;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 131;
        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int middle = (max + min) / 2;
            if (arr[middle] > number) {
                max = middle - 1;
            } else if (arr[middle] < number) {
                min = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
