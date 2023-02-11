package cn.mycloudway.demo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println(i3 == i4);
    }
}
