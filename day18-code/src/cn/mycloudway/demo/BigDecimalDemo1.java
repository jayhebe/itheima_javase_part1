package cn.mycloudway.demo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd3.add(bd4));

        BigDecimal bd5 = BigDecimal.valueOf(10);
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd5 == bd6);
    }
}
