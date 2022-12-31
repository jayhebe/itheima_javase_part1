package cn.mycloudway.test;

import java.util.Random;

public class ShuffleString {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(shuffle(str));
    }

    public static String shuffle(String str) {
        char[] chars = str.toCharArray();
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            int index = random.nextInt(str.length());
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }

        return new String(chars);
    }
}
