package cn.mycloudway.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        String str = "abbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaa";
        String pattern = "ab+?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
