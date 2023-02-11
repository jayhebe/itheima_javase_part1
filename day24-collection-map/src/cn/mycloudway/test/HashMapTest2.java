package cn.mycloudway.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();
        String[] choices = {"A", "B", "C", "D"};
        Random random = new Random();

        for (int i = 0; i < 80; i++) {
            int choice = random.nextInt(4);
            String key = choices[choice];
            /*if (result.containsKey(key)) {
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }*/
            result.put(key, result.getOrDefault(key, 0));
            result.put(key, result.get(key) + 1);
        }

        result.forEach((key, count) -> System.out.println(key + ": " + count));
    }
}
