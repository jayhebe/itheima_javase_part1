package cn.mycloudway.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("a", 123);
        map.put("a", 111);
        map.put("b", 456);
        map.put("c", 789);

        System.out.println(map);
    }
}
