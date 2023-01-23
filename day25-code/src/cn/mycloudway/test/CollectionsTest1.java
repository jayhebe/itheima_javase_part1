package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "范闲", "范建", "范统", "杜紫藤", "杜齐燕", "宋和凡", "侯龙腾", "朱轶群", "袁名媛");
        Random random = new Random();

        while (list.size() != 0) {
            int index = random.nextInt(list.size());
            String name = list.get(index);
            list.remove(name);
            System.out.println(name);
        }
    }
}
