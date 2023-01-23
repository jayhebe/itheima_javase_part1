package cn.mycloudway.test;

import java.util.ArrayList;

public class StreamTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        list.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
    }
}
