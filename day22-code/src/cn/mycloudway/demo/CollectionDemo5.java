package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo5 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        /*collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        collection.forEach(s -> System.out.println(s));
    }
}
