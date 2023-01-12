package cn.mycloudway.demo;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(123);
        list.add("abc");
        list.add(new Student("zhangsan", 23));

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
