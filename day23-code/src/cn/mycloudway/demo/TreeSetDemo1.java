package cn.mycloudway.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println(treeSet);

        System.out.println("----------------------");

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        System.out.println("----------------------");

        treeSet.forEach(i -> System.out.println(i));
    }
}
