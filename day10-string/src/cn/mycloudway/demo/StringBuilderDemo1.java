package cn.mycloudway.demo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("0123456789");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
