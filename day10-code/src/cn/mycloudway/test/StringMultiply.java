package cn.mycloudway.test;

public class StringMultiply {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "10";
        System.out.println(parseInt(str1) * parseInt(str2));
    }

    public static int parseInt(String number) {
        char[] chars = number.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - 48);
        }

        return result;
    }
}
