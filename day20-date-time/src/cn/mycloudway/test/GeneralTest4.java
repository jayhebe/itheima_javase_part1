package cn.mycloudway.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class GeneralTest4 {
    public static void main(String[] args) throws ParseException {
        //JDK7
        String birthday = "2000-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        long todayTime = System.currentTimeMillis();
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2000, 1, 1);
        LocalDate ld2 = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(ld1, ld2));
    }
}
