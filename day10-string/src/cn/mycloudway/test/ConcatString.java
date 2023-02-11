package cn.mycloudway.test;

public class ConcatString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String strArr = concat(arr);
        System.out.println(strArr);
    }

    public static String concat(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                result += (arr[i] + ", ");
            } else {
                result += arr[i];
            }
        }
        result += "]";

        return result;
    }
}
