package cn.mycloudway.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("version", "1");
        map.put("host", "www.baidu.com");
        map.put("status", "200");
        map.put("msg", "ok");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

        System.out.println("----------------------------");

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("----------------------------");

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("----------------------------");

        entries.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
