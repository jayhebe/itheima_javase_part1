package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张无忌", "张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周芷若", "赵敏");

        list1.stream()
                .distinct()
                .forEach(name -> System.out.println(name));

        System.out.println("-------------------------------------");

        Stream.concat(list1.stream(), list2.stream())
                .forEach(name -> System.out.println(name));
    }
}
