package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Random;

public class LuckyDraw implements Runnable {
    private ArrayList<Integer> awards;

    public LuckyDraw() {
    }

    public LuckyDraw(ArrayList<Integer> awards) {
        this.awards = awards;
    }

    @Override
    public void run() {
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();

        while (true) {
            synchronized (LuckyDraw.class) {
                if (awards.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + result);
                    break;
                } else {
                    int index = random.nextInt(awards.size());
                    int value = awards.remove(index);
                    result.add(value);
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
