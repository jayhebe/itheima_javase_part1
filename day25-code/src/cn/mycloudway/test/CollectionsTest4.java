package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

public class CollectionsTest4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");

        ArrayList<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        map.put("江苏省", cities1);
        map.put("湖北省", cities2);
        map.put("河北省", cities3);

        map.forEach((province, cities) -> {
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String city : cities) {
                sj.add(city);
            }
            System.out.println(province + " = " + sj);
        });
    }
}
