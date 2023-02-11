package cn.mycloudway.test;

import java.util.Scanner;

public class GeneralExercise5 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            boolean flag = true;
            while (flag) {
                System.out.print("请输入第" + (i + 1) + "个评委的评分(0 - 100): ");
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("数据无效，请重新输入");
                } else {
                    scores[i] = score;
                    flag = false;
                }
            }
        }

        System.out.println("The final score is " + getScore(scores));
    }

    public static double getScore(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        double finalScore = 0.0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }

        for (int score : scores) {
            sum += score;
        }
        sum -= (max + min);

        finalScore = (double)sum / (scores.length - 2);

        return finalScore;
    }
}
