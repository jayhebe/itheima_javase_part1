package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String str : collection) {
            System.out.println(str);
        }
    }
}
