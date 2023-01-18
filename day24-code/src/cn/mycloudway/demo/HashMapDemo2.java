package cn.mycloudway.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("version", "1");
        map.put("host", "www.baidu.com");
        map.put("status", "200");
        map.put("msg", "ok");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("----------------------------");

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("----------------------------");

        keys.forEach(key -> System.out.println(key + ": " + map.get(key)));
    }
}
