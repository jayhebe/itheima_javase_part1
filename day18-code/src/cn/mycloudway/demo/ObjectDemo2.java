package cn.mycloudway.demo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        System.out.println(s1.equals(s2));
    }
}
