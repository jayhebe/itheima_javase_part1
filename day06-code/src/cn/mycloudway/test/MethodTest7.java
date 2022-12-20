package cn.mycloudway.test;

public class MethodTest7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};
        int value = 12;

        System.out.println(isExisting(arr, value));
    }

    public static boolean isExisting(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }
}
