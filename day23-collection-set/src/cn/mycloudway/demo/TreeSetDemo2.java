package cn.mycloudway.demo;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("zhangsan", 23));
        treeSet.add(new Student("lisi", 24));
        treeSet.add(new Student("wangwu", 25));
        treeSet.add(new Student("xiji", 18));

        System.out.println(treeSet);
    }
}
