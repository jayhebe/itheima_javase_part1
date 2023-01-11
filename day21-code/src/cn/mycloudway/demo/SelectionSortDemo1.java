package cn.mycloudway.demo;

public class SelectionSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {35, 16, 23, 8, 77, 65, 99, 41};
        int[] newArr = selectionSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }


}
