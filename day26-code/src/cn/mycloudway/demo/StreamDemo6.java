package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        System.out.println("-------------------------------------");

        list.stream()
                .limit(3)
                .forEach(name -> System.out.println(name));

        System.out.println("-------------------------------------");

        list.stream()
                .skip(4)
                .forEach(name -> System.out.println(name));

        System.out.println("-------------------------------------");

        list.stream()
                .skip(3)
                .limit(3)
                .forEach(name -> System.out.println(name));
    }
}
