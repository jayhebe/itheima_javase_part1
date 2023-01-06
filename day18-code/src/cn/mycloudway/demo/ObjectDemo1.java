package cn.mycloudway.demo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());

        Student s = new Student("zhangsan", 25);
        System.out.println(s.toString());
        System.out.println(s);
    }
}
