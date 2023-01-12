package cn.mycloudway.test;

import java.util.Arrays;

public class LambdaTest1 {
    public static void main(String[] args) {
        String[] strings = {
                "Hello world",
                "Morning Jarvis",
                "Python is the best programming language",
                "OK"
        };

        Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(strings));
    }
}
