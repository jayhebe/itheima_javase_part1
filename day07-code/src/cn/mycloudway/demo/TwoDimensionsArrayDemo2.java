package cn.mycloudway.demo;

public class TwoDimensionsArrayDemo2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
