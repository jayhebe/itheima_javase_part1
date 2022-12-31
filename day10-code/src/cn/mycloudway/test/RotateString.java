package cn.mycloudway.test;

public class RotateString {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "cdeab";

        System.out.println(check(a, b));
    }

    public static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            a = rotate(a);
            if (a.equals(b)) {
                return true;
            }
        }

        return false;
    }

    public static String rotate(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        sb.append(str.charAt(0));

        return sb.toString();
    }
}
