package cn.mycloudway.demo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String s = "来黑马程序员学习Java，" +
                "电话：18512516758，18512508907" +
                "或者联系邮箱：boniu@itcast.cn" +
                "座机电话：01036517895，010-98951256" +
                "邮箱：bozai@itcast.cn，" +
                "热线电话：400-618-9090，400-618-4000，4006184000，4006189090";

        ArrayList<String> patterns = new ArrayList<>();
        String mobilePattern = "1[3-9]\\d{9}";
        String hotlinePattern = "[48]00-?\\d{3}-?\\d{4}";
        String phonePattern = "0\\d{2,3}-?[1-9]\\d{7}";
        String emailPattern = "\\w+@[\\w&&[^_]]+(\\.[a-z]{2,3}){1,2}";
        patterns.add(mobilePattern);
        patterns.add(hotlinePattern);
        patterns.add(phonePattern);
        patterns.add(emailPattern);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < patterns.size(); i++) {
            Pattern p = Pattern.compile(patterns.get(i));
            Matcher m = p.matcher(s);
            while (m.find()) {
                result.add(m.group());
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
