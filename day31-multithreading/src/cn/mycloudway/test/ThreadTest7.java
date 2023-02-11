package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> awards = new ArrayList<>();
        Collections.addAll(awards, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        LuckyDrawCall ldc = new LuckyDrawCall(awards);
        FutureTask<Integer> ft1 = new FutureTask<>(ldc);
        FutureTask<Integer> ft2 = new FutureTask<>(ldc);

        Thread t1 = new Thread(ft1, "抽奖箱1");
        Thread t2 = new Thread(ft2, "抽奖箱2");

        t1.start();
        t2.start();

        int max1 = ft1.get();
        int max2 = ft2.get();

        System.out.println(max1);
        System.out.println(max2);
    }
}
