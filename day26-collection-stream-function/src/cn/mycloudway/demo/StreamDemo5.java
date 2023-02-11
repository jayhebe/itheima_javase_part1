package cn.mycloudway.demo;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(i -> System.out.println(i));
        Stream.of("a", "b", "c", "d").forEach(s -> System.out.println(s));
    }
}
