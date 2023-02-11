package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

public class ThreadTest6 {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ArrayList<Integer> awards = new ArrayList<>();
        Collections.addAll(awards, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
        LuckyDraw ld = new LuckyDraw(awards);

        Thread t1 = new Thread(ld, "抽奖箱1");
        Thread t2 = new Thread(ld, "抽奖箱2");

        t1.start();
        t2.start();
    }
}
