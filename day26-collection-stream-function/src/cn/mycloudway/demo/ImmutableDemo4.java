package cn.mycloudway.demo;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("张三", "语文");
        map.put("李四", "语文");
        map.put("王五", "语文");
        map.put("赵六", "语文");

        Map<String, String> newMap = Map.copyOf(map);

        //Immutable object cannot be modified, java.lang.UnsupportedOperationException
        //newMap.put("aaa", "fff");
    }
}
