package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
