package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "abc", "bcd", "12314", "define", "hehehe", "world");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.swap(list, 2, 4);
        System.out.println(list);
    }
}
