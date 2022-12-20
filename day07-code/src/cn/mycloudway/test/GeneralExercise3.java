package cn.mycloudway.test;

import java.util.Random;

public class GeneralExercise3 {
    public static void main(String[] args) {
        System.out.println("Your verification code is " + getVerificationCode(5));
    }

    public static String getVerificationCode(int length) {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        /*
        char[] allLetters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z', 'a', 'b',
                'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'
        };
        */
        char[] allLetters = new char[52];
        for (int i = 0; i < allLetters.length; i++) {
            if (i < 26) {
                allLetters[i] = (char)(97 + i);
            } else {
                allLetters[i] = (char)(65 + i - 26);
            }
        }

        int[] allDigits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < length - 1; i++) {
            code.append(allLetters[random.nextInt(allLetters.length)]);
        }
        code.append(allDigits[random.nextInt(allDigits.length)]);

        return code.toString();
    }
}
