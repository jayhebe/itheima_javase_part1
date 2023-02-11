package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

//        coll.clear();
        coll.remove("aaa");
        System.out.println(coll);

        System.out.println(coll.contains("bbb"));
    }
}
