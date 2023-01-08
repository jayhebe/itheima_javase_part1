package cn.mycloudway.demo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        System.out.println(ZoneId.systemDefault());

        ZoneId zoneId1 = ZoneId.of("Europe/London");
        System.out.println(zoneId1);
    }
}
