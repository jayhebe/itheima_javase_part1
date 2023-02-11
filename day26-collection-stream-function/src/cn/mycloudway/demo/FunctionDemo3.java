package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        list.stream()
                .filter(new StringOperation()::stringFilter)
                .forEach(System.out::println);
    }
}
