package cn.mycloudway.demo;

public class TwoDimensionsArrayDemo1 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

//        System.out.println(arr3[0]);
//        System.out.println(arr3[0][0]);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
