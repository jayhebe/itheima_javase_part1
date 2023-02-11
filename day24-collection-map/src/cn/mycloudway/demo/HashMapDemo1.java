package cn.mycloudway.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Tom", "Jerry");
        map.put("Jimmy", "Billy");
        map.put("Big S", "Small S");

        String value = map.put("Tom", "Adam");

        System.out.println(map.size());
        System.out.println(value);
        System.out.println(map);

        map.remove("Big S");
        System.out.println(map);

        System.out.println(map.containsKey("Jimmy"));
        System.out.println(map.containsValue("lalala"));

        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);

        System.out.println(map.isEmpty());
    }
}
