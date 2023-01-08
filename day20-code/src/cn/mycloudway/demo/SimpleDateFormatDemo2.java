package cn.mycloudway.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf2.format(sdf1.parse(str)));
    }
}
