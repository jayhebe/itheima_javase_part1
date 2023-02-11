package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        list.add(1, "qqq");
        System.out.println(list);

        System.out.println(list.remove(0));
    }
}
