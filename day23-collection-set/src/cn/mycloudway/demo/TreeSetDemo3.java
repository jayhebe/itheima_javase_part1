package cn.mycloudway.demo;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(
                (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length()
        );

        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("qwer");

        System.out.println(treeSet);
    }
}
