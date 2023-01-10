package cn.mycloudway.test;

import java.time.LocalDate;
import java.util.Calendar;

public class GeneralTest5 {
    public static void main(String[] args) {
        //JDK7
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);

        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);
        System.out.println(ld.isLeapYear());
    }
}
