package cn.mycloudway.demo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        String s3 = "abc";
        String s4 = "bcd";
        System.out.println(s3 == s4);

        String s5 = new String("abc");
        String s6 = "abc";
        System.out.println(s5 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s5.equals(s6));

        String s7 = new String("ABC");
        String s8 = "abc";
        System.out.println(s7.equalsIgnoreCase(s8));
    }
}
