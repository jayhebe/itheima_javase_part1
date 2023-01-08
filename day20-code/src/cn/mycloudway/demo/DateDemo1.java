package cn.mycloudway.demo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(0L);
        System.out.println(d2);

        d2.setTime(1000L);
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}
