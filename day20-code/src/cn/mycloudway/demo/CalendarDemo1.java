package cn.mycloudway.demo;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.DAY_OF_MONTH, 30);
        c.add(Calendar.MONTH, 1);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
