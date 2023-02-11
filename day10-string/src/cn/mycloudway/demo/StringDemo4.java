package cn.mycloudway.demo;

public class StringDemo4 {
    public static void main(String[] args) {
        String s = "";

        for (int i = 0; i < 1000000; i++) {
            s += "abc";
        }

        System.out.println(s);
    }
}
