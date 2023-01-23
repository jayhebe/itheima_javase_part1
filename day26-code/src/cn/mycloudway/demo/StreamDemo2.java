package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");

        Stream<String> stream1 = list.stream();
        stream1.forEach(s -> System.out.println(s));

        System.out.println("-----------------------------------");

        list.stream().forEach(s -> System.out.println(s));
    }
}
