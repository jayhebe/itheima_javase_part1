package cn.mycloudway.demo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        BigInteger b1 = new BigInteger(4, r);
        System.out.println(b1);

        BigInteger b2 = new BigInteger("999999999999999999999999999999999");
        System.out.println(b2);

        BigInteger b3 = new BigInteger("100", 2);
        System.out.println(b3);

        System.out.println(BigInteger.valueOf(Long.MAX_VALUE));

        BigInteger b4 = BigInteger.valueOf(16);
        BigInteger b5 = BigInteger.valueOf(16);
        System.out.println(b4 == b5);

        BigInteger b6 = BigInteger.valueOf(17);
        BigInteger b7 = BigInteger.valueOf(17);
        System.out.println(b6 == b7);

        BigInteger b8 = BigInteger.valueOf(1);
        BigInteger b9 = BigInteger.valueOf(2);
        System.out.println(b8.add(b9));
    }
}
