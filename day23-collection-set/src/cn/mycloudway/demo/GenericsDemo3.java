package cn.mycloudway.demo;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        ListUtil.addAll(list1, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        ListUtil.addAll(list2, 123, 456, 789);
        System.out.println(list2);
    }
}
