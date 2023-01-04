package cn.mycloudway.test;

import java.util.ArrayList;

public class SelfPowerNumber {
    public static void main(String[] args) {
        int count2 = 0;
        for (int i = 10; i < 100; i++) {
            if (isSelfPowerNumber(i)) {
                System.out.println(i);
                count2++;
            }
        }

        System.out.println("一共有" + count2 + "个两位自幂数");

        int count3 = 0;
        for (int i = 100; i < 1000; i++) {
            if (isSelfPowerNumber(i)) {
                System.out.println(i);
                count3++;
            }
        }

        System.out.println("一共有" + count3 + "个水仙花数");

        int count4 = 0;
        for (int i = 1000; i < 10000; i++) {
            if (isSelfPowerNumber(i)) {
                System.out.println(i);
                count4++;
            }
        }

        System.out.println("一共有" + count4 + "个四叶玫瑰数");

        int count5 = 0;
        for (int i = 10000; i < 100000; i++) {
            if (isSelfPowerNumber(i)) {
                System.out.println(i);
                count5++;
            }
        }

        System.out.println("一共有" + count5 + "个五角星数");
    }

    public static boolean isSelfPowerNumber(int number) {
        ArrayList<Integer> units = new ArrayList<>();
        int sum = 0;
        int digit = 0;
        int temp = number;

        while (temp != 0) {
            int unit = temp % 10;
            units.add(unit);
            temp /= 10;
            digit++;
        }

        for (int i = 0; i < units.size(); i++) {
            sum += Math.pow(units.get(i), digit);
        }

        return sum == number;
    }
}
