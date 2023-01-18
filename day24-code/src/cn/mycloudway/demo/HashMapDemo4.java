package cn.mycloudway.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("version", "1");
        map.put("host", "www.baidu.com");
        map.put("status", "200");
        map.put("msg", "ok");

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
