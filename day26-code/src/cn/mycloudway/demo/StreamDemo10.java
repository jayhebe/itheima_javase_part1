package cn.mycloudway.demo;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> gentlemen = new ArrayList<>();

        Collections.addAll(list,
                "张无忌-男-15", "张强-男-14", "张三丰-男-100",
                "张翠山-男-40", "赵敏-女-31", "周芷若-女-27",
                "张良-男-35", "王二麻子-男-37", "谢广坤-男-44");

        list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .forEach(name -> gentlemen.add(name));

        System.out.println(gentlemen);

        List<String> newList = list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(newList);

        Set<String> newSet = list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .collect(Collectors.toSet());

        System.out.println(newSet);

        Map<String, Integer> map = list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));

        System.out.println(map);
    }
}
