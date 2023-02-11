package cn.mycloudway.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("ccc");

        System.out.println(set);

        System.out.println("------------------------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("------------------------------");

        set.forEach(s -> System.out.println(s));
    }
}
