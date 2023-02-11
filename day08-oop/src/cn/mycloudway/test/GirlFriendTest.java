package cn.mycloudway.test;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setName("Sherry");
        gf.setAge(18);
        gf.setGender("female");

        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        gf.eat();
        gf.sleep();
    }
}
