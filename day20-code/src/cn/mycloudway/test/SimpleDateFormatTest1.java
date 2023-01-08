package cn.mycloudway.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) throws ParseException {
        String start = "2023-11-11 00:00:00";
        String end = "2023-11-11 00:10:00";
        String xiaojia = "2023-11-11 00:01:00";
        String xiaopi = "2023-11-11 00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();
        long xiaojiaTime = sdf.parse(xiaojia).getTime();
        long xiaopiTime = sdf.parse(xiaopi).getTime();

        if (xiaojiaTime >= startTime && xiaojiaTime <= endTime) {
            System.out.println("小贾抢到了");
        } else {
            System.out.println("小贾没抢到");
        }

        if (xiaopiTime >= startTime && xiaopiTime <= endTime) {
            System.out.println("小皮抢到了");
        } else {
            System.out.println("小皮没抢到");
        }
    }
}
