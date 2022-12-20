package cn.mycloudway.test;

public class ThreeMonks {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int higher = height1 > height2 ? height1 : height2;

        System.out.println(higher > height3 ? higher : height3);
    }
}
