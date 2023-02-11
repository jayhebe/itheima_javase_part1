package cn.mycloudway.demo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);

        Random random = new Random();

        Date d2 = new Date(Math.abs(random.nextInt()));
        Date d3 = new Date(Math.abs(random.nextInt()));
        long time2 = d2.getTime();
        long time3 = d3.getTime();

        System.out.println(d2);
        System.out.println(d3);
        System.out.println(time2 > time3);
    }
}
