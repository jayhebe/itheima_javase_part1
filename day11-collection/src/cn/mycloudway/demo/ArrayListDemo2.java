package cn.mycloudway.demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        System.out.println(list);
//
//        list.remove("aaa");
//        System.out.println(list);
//
//        String str = list.remove(1);
//        System.out.println(str);
        list.set(1, "ddd");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
