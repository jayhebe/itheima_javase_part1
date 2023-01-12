package cn.mycloudway.test;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getCount(1));
    }

    public static int getCount(int day) {
        if (day <= 0 || day >= 11) {
            return -1;
        }

        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
