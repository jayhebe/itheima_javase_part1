package cn.mycloudway.demo;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
