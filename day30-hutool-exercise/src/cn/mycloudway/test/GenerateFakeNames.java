package cn.mycloudway.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenerateFakeNames {
    public static void main(String[] args) throws IOException {
        String familyNameUrl = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameUrl = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameUrl = "http://www.haoming8.cn/baobao/7641.html";

        String webFamilyNames = webCrawler(familyNameUrl);
        String webBoyNames = webCrawler(boyNameUrl);
        String webGirlNames = webCrawler(girlNameUrl);

        ArrayList<String> tempFamilyNameList = getData(webFamilyNames, "(.{4})(，|。)", 1);
        ArrayList<String> tempBoyNameList = getData(webBoyNames, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> tempGirlNameList = getData(webGirlNames, "(.. ){4}..", 0);

        ArrayList<String> familyNameList = new ArrayList<>();
        for (String names : tempFamilyNameList) {
            for (int i = 0; i < names.length(); i++) {
                familyNameList.add(names.charAt(i) + "");
            }
        }

        ArrayList<String> boyNameList = new ArrayList<>();
        for (String name : tempBoyNameList) {
            if (! boyNameList.contains(name)) {
                boyNameList.add(name);
            }
        }

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String names : tempGirlNameList) {
            String[] girlNames = names.split(" ");
            Collections.addAll(girlNameList, girlNames);
        }

        HashSet<String> boyNames = getBoyNames(familyNameList, boyNameList, 60);
        HashSet<String> girlNames = getGirlNames(familyNameList, girlNameList, 60);

        BufferedWriter bw = new BufferedWriter(new FileWriter("day30-code/names.txt"));
        for (String name : boyNames) {
            bw.write(name);
            bw.newLine();
        }
        for (String name : girlNames) {
            bw.write(name);
            bw.newLine();
        }

        bw.close();
    }

    public static String webCrawler(String urlAddress) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(urlAddress);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }

        isr.close();

        return sb.toString();
    }

    public static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }

        return list;
    }

    public static HashSet<String> getBoyNames(ArrayList<String> familyNameList, ArrayList<String> boyNameList, int count) {
        HashSet<String> boyNames = new HashSet<>();
        Random random = new Random();

        while (boyNames.size() != count) {
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            int age = random.nextInt(4) + 20;

            boyNames.add(familyNameList.get(0) + boyNameList.get(0) + "-男-" + age);
        }

        return boyNames;
    }

    public static HashSet<String> getGirlNames(ArrayList<String> familyNameList, ArrayList<String> girlNameList, int count) {
        HashSet<String> girlNames = new HashSet<>();
        Random random = new Random();

        while (girlNames.size() != count) {
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            int age = random.nextInt(4) + 18;

            girlNames.add(familyNameList.get(0) + girlNameList.get(0) + "-女-" + age);
        }

        return girlNames;
    }
}
