package cn.mycloudway.demo;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        int[] arr = {};
        try {
            System.out.println(getMax(arr));
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("下标越界异常");
        }
    }

    public static int getMax(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
