package cn.mycloudway.test;

import java.util.TreeMap;

public class TreeMapTest1 {
    public static void main(String[] args) {
        String test = "aababcabcdabcde";
        char[] chars = test.toCharArray();
        TreeMap<Character, Integer> result = new TreeMap<>();

        for (char c : chars) {
            result.put(c, result.getOrDefault(c, 0));
            result.put(c, result.get(c) + 1);
        }

        result.forEach((c, i) -> System.out.print(c + " (" + i + ") "));
    }
}
