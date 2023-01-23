package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "张强-14", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-44");

        list.stream()
                .map(name -> Integer.parseInt(name.split("-")[1]))
                .forEach(age -> System.out.println(age));
    }
}
