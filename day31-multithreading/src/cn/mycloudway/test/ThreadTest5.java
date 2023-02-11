package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ThreadTest5 {
    static ArrayList<Integer> awards = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(awards, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
        Random random = new Random();

        Runnable r = () -> {
            while (true) {
                synchronized (ThreadTest5.class) {
                    if (awards.size() == 0) {
                        break;
                    } else {
                        int index = random.nextInt(awards.size());
                        System.out.println(Thread.currentThread().getName() + "又产生了一个" + awards.remove(index) + "元大奖");
                    }
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(r, "抽奖箱1");
        Thread t2 = new Thread(r, "抽奖箱2");

        t1.start();
        t2.start();
    }
}
