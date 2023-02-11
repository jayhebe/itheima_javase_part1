package cn.mycloudway.demo;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        int food = 5;
        for (int i = 1; i <= food; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("吃第" + i + "个包子");
        }
    }
}
