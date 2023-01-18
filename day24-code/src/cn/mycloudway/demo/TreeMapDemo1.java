package cn.mycloudway.demo;

import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(2, "苹果手机");
        treeMap.put(1, "小米手机");
        treeMap.put(4, "华为手机");
        treeMap.put(3, "OPPO手机");

        NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
        for (int key : navigableSet.descendingSet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }

        System.out.println("---------------------------------");

        NavigableSet<Integer> integerNavigableSet = treeMap.navigableKeySet();
        for (int key : integerNavigableSet.descendingSet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
