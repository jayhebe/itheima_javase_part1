package cn.mycloudway.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) throws IOException {
        String url = "https://changyongdianhuahaoma.bmcx.com/";
        //String pattern = "0\\d{2,3}-\\d{8}";
        String pattern = "\\d{3}-\\d{3}-\\d{4}";
        ArrayList<String> result = find(url, pattern);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> find(String url, String pattern) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        URLConnection conn = new URL(url).openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(line);
            while (m.find()) {
                result.add(m.group());
            }
        }

        br.close();

        return result;
    }
}
