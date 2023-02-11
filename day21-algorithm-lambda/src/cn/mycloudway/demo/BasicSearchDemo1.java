package cn.mycloudway.demo;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 82;
        System.out.println(basicSearch(arr, number));
    }

    public static boolean basicSearch(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }

        return false;
    }
}
