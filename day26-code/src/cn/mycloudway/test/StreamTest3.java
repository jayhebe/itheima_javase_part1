package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        ArrayList<String> actors = new ArrayList<>();
        ArrayList<String> actresses = new ArrayList<>();

        Collections.addAll(actors, "周杰伦,40", "王力宏,39", "陈奕迅,48", "林俊杰,41", "陶喆,43", "潘玮柏,38");
        Collections.addAll(actresses, "杨紫,29", "张韶涵,34", "杨紫琼,50", "蔡依林,40", "萧亚轩,43", "杨洋,33");

        List<Actor> actorList = Stream.concat(
                actors.stream()
                        .filter(name -> name.split(",")[0].length() == 3)
                        .limit(2),
                actresses.stream()
                        .filter(name -> name.split(",")[0].startsWith("杨"))
                        .skip(1)
        ).map(name -> new Actor(name.split(",")[0], Integer.parseInt(name.split(",")[1])))
                .toList();

        System.out.println(actorList);
    }
}
