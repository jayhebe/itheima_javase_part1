package cn.mycloudway.demo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 25);
        Student s2 = new Student("zhangsan", 25);
        Student s3 = null;

        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(s1, s3));
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.nonNull(s1));
    }
}
