package cn.mycloudway.test;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[4];
        
        GirlFriend g1 = new GirlFriend("石原里美", 20, '女', "逛街");
        GirlFriend g2 = new GirlFriend("桥本环奈", 18, '女', "逛街");
        GirlFriend g3 = new GirlFriend("西野七濑", 19, '女', "逛街");
        GirlFriend g4 = new GirlFriend("新垣结衣", 25, '女', "逛街");

        girlFriends[0] = g1;
        girlFriends[1] = g2;
        girlFriends[2] = g3;
        girlFriends[3] = g4;

        int sumAge = 0;
        for (int i = 0; i < girlFriends.length; i++) {
            sumAge += girlFriends[i].getAge();
        }

        double avgAge = (double)sumAge / girlFriends.length;
        System.out.println("The average age of 4 girl friends is " + avgAge);

        for (int i = 0; i < girlFriends.length; i++) {
            if (girlFriends[i].getAge() < avgAge) {
                System.out.println(girlFriends[i].getName() + " is younger than average.");
            }
        }
    }
}
