package cn.mycloudway.test;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "Admin123!";

        Scanner scanner = new Scanner(System.in);

        int count = 3;
        while (count > 0) {
            System.out.print("请输入用户名：");
            String inputUsername = scanner.next();
            System.out.print("请输入密码：");
            String inputPassword = scanner.next();

            if (username.equalsIgnoreCase(inputUsername) && password.equals(inputPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (count > 1) {
                    System.out.println("登录失败，还有" + (count - 1) + "次机会");
                } else {
                    System.out.println("账户被锁定，请联系管理员");
                }
            }
            count--;
        }
    }
}
