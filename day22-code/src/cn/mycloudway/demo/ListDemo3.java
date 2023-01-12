package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        list.forEach(s -> System.out.println(s));

        System.out.println("---------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
    }
}
