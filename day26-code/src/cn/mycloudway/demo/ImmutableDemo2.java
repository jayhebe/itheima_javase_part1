package cn.mycloudway.demo;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------------");

        set.forEach(s -> System.out.println(s));

        //Immutable object cannot be modified, java.lang.UnsupportedOperationException
        //set.add("test");
        //set.remove("张三");
    }
}
