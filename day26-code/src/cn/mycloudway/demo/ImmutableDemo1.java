package cn.mycloudway.demo;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------------------");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------------");

        list.forEach(s -> System.out.println(s));

        //Immutable object cannot be modified, java.lang.UnsupportedOperationException
        //list.add("test");
        //list.remove("张三");
    }
}
