package cn.mycloudway.test;

public class MethodTest4 {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;

        System.out.println(compare(a, b));
    }

    public static boolean compare(long a, long b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compare(short a, short b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compare(byte a, byte b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
 }
