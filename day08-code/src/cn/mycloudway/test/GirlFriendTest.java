package cn.mycloudway.test;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setName("Sherry");
        gf.setAge(18);

        System.out.println(gf.getName());
        System.out.println(gf.getAge());

        gf.eat();
        gf.sleep();
    }
}
