package cn.mycloudway.demo;

public class SystemDemo3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        int[] arr5 = new int[10];

        System.arraycopy(arr1, 0, arr2, 0, 10);
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.arraycopy(arr1, 0, arr3, 1, 5);
        for (int i : arr3) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.arraycopy(arr1, 0, arr4, 4, 3);
        for (int i : arr4) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.arraycopy(arr1, 6, arr5, 2, 3);
        for (int i : arr5) {
            System.out.print(i + " ");
        }
    }
}
