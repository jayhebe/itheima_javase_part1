package cn.mycloudway.demo;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        System.out.println("看看我执行了吗");
    }
}
