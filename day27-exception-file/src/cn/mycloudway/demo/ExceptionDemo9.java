package cn.mycloudway.demo;

public class ExceptionDemo9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗");
    }
}
