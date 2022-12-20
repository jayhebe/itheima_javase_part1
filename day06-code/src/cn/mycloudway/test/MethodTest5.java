package cn.mycloudway.test;

public class MethodTest5 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        iterateArray(arr);
    }

    public static void iterateArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }
}
