package cn.mycloudway.test;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        System.out.println(sb);
    }
}
