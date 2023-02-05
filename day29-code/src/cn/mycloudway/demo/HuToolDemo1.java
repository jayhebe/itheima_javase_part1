package cn.mycloudway.demo;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HuToolDemo1 {
    public static void main(String[] args) {
        File file = FileUtil.file("D:\\", "aaa", "bbb", "a.txt");
        System.out.println(file);

        File touch = FileUtil.touch(file);
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        FileUtil.writeLines(list, "D:\\a.txt", "UTF8");
        FileUtil.appendLines(list, "D:\\a.txt", "UTF8");

        List<String> lines = FileUtil.readLines("D:\\a.txt", "UTF8");
        System.out.println(lines);
    }
}
