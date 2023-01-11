package cn.mycloudway.demo;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {35, 16, 23, 8, 77, 65, 99, 41};
        int[] newArr = bubbleSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
