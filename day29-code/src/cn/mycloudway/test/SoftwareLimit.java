package cn.mycloudway.test;

import java.io.*;

public class SoftwareLimit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day29-code/limit.txt"));
        BufferedWriter bw = null;

        int count = Integer.parseInt(br.readLine());
        count++;
        if (count < 4) {
            System.out.println("欢迎使用本软件，第" + count + "次使用免费");
            bw = new BufferedWriter(new FileWriter("day29-code/limit.txt"));
            bw.write(count + "");
            bw.close();
        } else {
            System.out.println("本软件只能免费使用三次，欢迎您注册会员后继续使用");
        }

        br.close();
    }
}
