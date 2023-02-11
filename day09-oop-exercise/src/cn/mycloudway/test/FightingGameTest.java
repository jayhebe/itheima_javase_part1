package cn.mycloudway.test;

public class FightingGameTest {
    public static void main(String[] args) {
        Role p1 = new Role("乔峰", 100, '男');
        Role p2 = new Role("鸠摩智", 100, '男');

        p1.showRoleInfo();
        p2.showRoleInfo();

        boolean flag = true;
        int round = 1;
        String p1Name = p1.getName();
        String p2Name = p2.getName();

        while (flag) {
            if (round % 2 == 1) {
                p1.attack(p2);
            } else {
                p2.attack(p1);
            }
            round++;

            if (p1.getBlood() <= 0) {
                System.out.println(p2Name + "K.O.了" + p1Name);
                flag = false;
            } else if (p2.getBlood() <= 0) {
                System.out.println(p1Name + "K.O.了" + p2Name);
                flag = false;
            }
        }
    }
}
