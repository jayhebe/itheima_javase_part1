package cn.mycloudway.demo;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("1", "2", "3", "4",
                "5", "6", "7", "8",
                "9", "10", "11", "12",
                "13", "14", "15", "16",
                "17", "18", "19", "20");

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("----------------------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
