package cn.mycloudway.demo;

public class MethodDemo6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void change(int[] arr) {
        arr[2] = 10;
    }
}
