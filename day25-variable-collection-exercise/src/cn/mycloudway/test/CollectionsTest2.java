package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();

        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        Collections.addAll(boys, "范闲", "范建", "范统", "杜紫藤", "宋和凡", "侯龙腾", "朱轶群", "朱穆朗玛峰");
        Collections.addAll(girls, "袁名媛", "杜齐燕", "田蜜蜜", "李彩");

        Collections.shuffle(list);

        Random random = new Random();
        int index = random.nextInt(list.size());
        if (list.get(index) == 1) {
            Collections.shuffle(boys);
            System.out.println(boys.get(0));
        } else {
            Collections.shuffle(girls);
            System.out.println(girls.get(0));
        }
    }
}
