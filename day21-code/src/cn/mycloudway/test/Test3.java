package cn.mycloudway.test;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getCount(20));
    }

    public static int getCount(int stage) {
        if (stage == 1) {
            return 1;
        }

        if (stage == 2) {
            return 2;
        }

        return getCount(stage - 1) + getCount(stage - 2);
    }
}
