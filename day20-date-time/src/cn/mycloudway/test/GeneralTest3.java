package cn.mycloudway.test;

public class GeneralTest3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(100));
        System.out.println(toBinaryString(6));
    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();

        while (number != 0) {
            sb.append(number % 2);
            number /= 2;
        }

        return sb.reverse().toString();
    }
}
