package cn.mycloudway.test;

public class LastWord {
    public static void main(String[] args) {
        String a = "this is a test sample";
        System.out.println(lastWordCount(a));
    }

    public static int lastWordCount(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        int count = 0;
        char[] chars = sb.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
