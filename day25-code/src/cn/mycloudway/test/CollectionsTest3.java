package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsTest3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list1, "范闲", "范建", "范统", "杜紫藤", "杜齐燕", "宋和凡", "侯龙腾", "朱轶群", "袁名媛");
        Random random = new Random();
        int waves = 5;

        for (int i = 0; i < waves; i++) {
            System.out.println("-----------第" + (i + 1) + "轮点名开始了-----------");
            while (list1.size() != 0) {
                int index = random.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
