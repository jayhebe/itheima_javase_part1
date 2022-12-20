package cn.mycloudway.test;

import java.util.Random;

public class GeneralExercise8 {
    public static void main(String[] args) {
        int[] bonus = {2, 588, 888, 1000, 10000};
        int[] usedBonus = new int[bonus.length];

        Random random = new Random();

        for (int i = 0; i < usedBonus.length; ) {
            int index = random.nextInt(bonus.length);
            if (usedBonus[index] != bonus[index]) {
                usedBonus[index] = bonus[index];
                System.out.println(bonus[index] + "元的奖金被抽出");
                i++;
            }
        }
    }
}
