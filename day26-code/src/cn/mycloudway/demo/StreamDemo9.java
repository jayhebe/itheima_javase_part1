package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        System.out.println(list.stream().count());

        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));
    }
}
