package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("zhangsan", 23);

        System.out.println(coll.contains(s4));

        coll.remove(s2);
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());
    }
}
