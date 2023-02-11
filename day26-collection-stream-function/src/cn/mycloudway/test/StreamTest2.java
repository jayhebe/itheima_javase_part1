package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("zhangsan, 23");
        list.add("lisi, 24");
        list.add("wangwu, 25");

        Map<String, Integer> map = list.stream()
                .filter(value -> Integer.parseInt(value.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(
                        value -> value.split(", ")[0],
                        value -> Integer.parseInt(value.split(", ")[1])
                ));

        System.out.println(map);
    }
}
