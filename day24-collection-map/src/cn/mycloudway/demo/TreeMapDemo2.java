package cn.mycloudway.demo;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>();

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhaoliu", 25);

        treeMap.put(s1, "北京");
        treeMap.put(s2, "天津");
        treeMap.put(s3, "上海");
        treeMap.put(s4, "广州");

        for (Student student : treeMap.descendingKeySet()) {
            System.out.println(student + ": " + treeMap.get(student));
        }

        System.out.println("----------------------------------");

        TreeMap<Student, String> orderedTree = new TreeMap<>(
                (o1, o2) -> o1.getAge() == o2.getAge() ? o1.compareTo(o2) : o1.getAge() - o2.getAge()
        );

        orderedTree.put(s1, "北京");
        orderedTree.put(s2, "天津");
        orderedTree.put(s3, "上海");
        orderedTree.put(s4, "广州");

        for (Student student : orderedTree.descendingKeySet()) {
            System.out.println(student + ": " + orderedTree.get(student));
        }
    }
}
