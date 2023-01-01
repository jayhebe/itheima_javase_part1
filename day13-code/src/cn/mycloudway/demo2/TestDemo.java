package cn.mycloudway.demo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        double[] doubleArr = {1.5, 3.7, 4.9, 5.8, 6.6};

        System.out.println(ArrayUtil.printArr(arr));
        System.out.println(ArrayUtil.getAverage(doubleArr));
    }
}
