package cn.mycloudway.test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.IOException;
import java.util.*;

public class GenerateFakeNamesNew {
    public static void main(String[] args) throws IOException {
        String familyNameUrl = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameUrl = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameUrl = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameContent = HttpUtil.get(familyNameUrl);
        String boyNameContent = HttpUtil.get(boyNameUrl);
        String girlNameContent = HttpUtil.get(girlNameUrl);

        List<String> tempFamilyNameList = ReUtil.findAll( "(.{4})(，|。)", familyNameContent, 1);
        List<String> tempBoyNameList = ReUtil.findAll( "([\\u4E00-\\u9FA5]{2})(、|。)", boyNameContent, 1);
        List<String> tempGirlNameList = ReUtil.findAll( "(.. ){4}..", girlNameContent, 0);

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

        FileUtil.writeLines(boyNames, "../../../day30-code/newNames.txt", "UTF8");
        FileUtil.writeLines(girlNames, "../../../day30-code/newNames.txt", "UTF8", true);
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
