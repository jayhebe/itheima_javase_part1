package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Callable;

public class LuckyDrawCall implements Callable<Integer> {
    private ArrayList<Integer> awards;

    public LuckyDrawCall() {
    }

    public LuckyDrawCall(ArrayList<Integer> awards) {
        this.awards = awards;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();

        while (true) {
            synchronized (LuckyDrawCall.class) {
                if (awards.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + result);
                    break;
                } else {
                    int index = random.nextInt(awards.size());
                    int value = awards.remove(index);
                    result.add(value);
                }
            }

            Thread.sleep(10);
        }

        if (result.size() == 0) {
            return null;
        } else {
            return Collections.max(result);
        }
    }
}
