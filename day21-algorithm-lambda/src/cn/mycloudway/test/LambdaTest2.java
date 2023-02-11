package cn.mycloudway.test;

import java.util.Arrays;

public class LambdaTest2 {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[5];

        GirlFriend gf1 = new GirlFriend("diandian", 18, 160);
        GirlFriend gf2 = new GirlFriend("huangxiaoyun", 20, 158);
        GirlFriend gf3 = new GirlFriend("xiaoen", 20, 158);
        GirlFriend gf4 = new GirlFriend("qiaobenhuannai", 18, 153);
        GirlFriend gf5 = new GirlFriend("shiyuanlimei", 22, 159);

        girlFriends[0] = gf1;
        girlFriends[1] = gf2;
        girlFriends[2] = gf3;
        girlFriends[3] = gf4;
        girlFriends[4] = gf5;

        Arrays.sort(girlFriends, (o1, o2) -> {
            if (o1.getAge() != o2.getAge()) {
                return o1.getAge() - o2.getAge();
            }

            if (o1.getHeight() != o2.getHeight()) {
                return o1.getHeight() - o2.getHeight();
            }

            return o1.getName().length() - o2.getName().length();
        });

        System.out.println(Arrays.toString(girlFriends));
    }
}
