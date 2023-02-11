package cn.mycloudway.demo;

import java.time.Instant;
import java.time.ZoneId;

public class InstantDemo1 {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(0L));
        System.out.println(Instant.ofEpochSecond(1L));
        System.out.println(Instant.ofEpochSecond(1L, 1000000000L));

        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));
        System.out.println(Instant.ofEpochMilli(0L).isBefore(Instant.ofEpochMilli(1000L)));
    }
}
