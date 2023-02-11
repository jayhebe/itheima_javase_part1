package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "张强,14", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,44");

        List<Student> students = list.stream()
                .map(Student::new)
                .toList();

        System.out.println(students);
    }
}
