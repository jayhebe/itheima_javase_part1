package cn.mycloudway.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        map.put(s1, "北京");
        map.put(s2, "天津");
        map.put(s3, "上海");
        map.put(s4, "广州");

        map.forEach((student, birthplace) -> System.out.println(student + ": " + birthplace));

        System.out.println("------------------------------");

        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("------------------------------");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
