package cn.mycloudway.demo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "123456789";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }
}
