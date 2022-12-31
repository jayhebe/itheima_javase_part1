package cn.mycloudway.test;

public class CheckIDNumber {
    public static void main(String[] args) {
        String id = "120101198802182145";

        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        String gender = id.substring(16, 17);

        if (Integer.parseInt(gender) % 2 == 1) {
            gender = "男性";
        } else {
            gender = "女性";
        }

        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + gender);
    }
}
