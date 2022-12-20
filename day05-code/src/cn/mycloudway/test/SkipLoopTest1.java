package cn.mycloudway.test;

public class SkipLoopTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                continue;
            }

            int tens = i / 10;
            int unit = i % 10;
            if (tens == 7 || unit == 7) {
                System.out.println(i);
            }
        }
    }
}
