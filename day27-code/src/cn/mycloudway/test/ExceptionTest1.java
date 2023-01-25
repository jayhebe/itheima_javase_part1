package cn.mycloudway.test;

import java.util.Scanner;

public class ExceptionTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String name = "";
        int age = 0;
        GirlFriend gf = new GirlFriend();

        while (flag) {
            System.out.print("请输入女朋友姓名：");
            try {
                name = scanner.nextLine();
                gf.setName(name);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.print("请输入女朋友年龄：");
            try {
                String strAge = scanner.nextLine();
                age = Integer.parseInt(strAge);
                gf.setAge(age);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            flag = false;
        }

        System.out.println(gf);
    }
}
