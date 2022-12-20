package cn.mycloudway.test;

public class GeneralExercise4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = copyArray(arr);

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }

    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return copy;
    }
}
