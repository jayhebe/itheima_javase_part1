package cn.mycloudway.test;

import java.util.Random;
import java.util.Scanner;

public class GeneralExercise9 {
    public static void main(String[] args) {
        int[] luckyLottery = getLuckyLottery();

        System.out.print("Lucky Lottery: ");
        for (int i = 0; i < luckyLottery.length; i++) {
            System.out.print(luckyLottery[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        int[] userLottery = getUserLottery();

        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userLottery.length - 1; i++) {
            for (int j = 0; j < luckyLottery.length - 1; j++) {
                if (userLottery[i] == luckyLottery[j]) {
                    redCount++;
                    break;
                }
            }
        }

        if (luckyLottery[6] == userLottery[6]) {
            blueCount++;
        }

        System.out.println("猜对红球数：" + redCount);
        System.out.println("猜对蓝球数：" + blueCount);

        if ((redCount == 0 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 2 && blueCount == 1)) {
            System.out.println("恭喜你获得六等奖，奖金5元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1) ) {
            System.out.println("恭喜你获得五等奖，奖金10元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你获得四等奖，奖金200元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你获得三等奖，奖金3000元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你获得二等奖，最高奖金500万元");
        } else if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你获得一等奖，最高奖金1000万元");
        } else {
            System.out.println("很遗憾您没能中奖，谢谢参与");
        }
    }

    public static int[] getLuckyLottery() {
        int[] lottery = new int[7];

        Random random = new Random();
        for (int i = 0; i < 6;) {
            int number = random.nextInt(33) + 1;
            if (!isExisting(lottery, number)) {
                lottery[i] = number;
                i++;
            }
        }

        lottery[6] = random.nextInt(16) + 1;

        return lottery;
    }

    public static int[] getUserLottery() {
        int[] lottery = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lottery.length;) {
            if (i == lottery.length - 1) {
                System.out.print("请输入蓝球号码(1-16)：");
                int blueNumber = scanner.nextInt();
                if (blueNumber < 1 || blueNumber > 16) {
                    System.out.println("蓝球号码不合法，请重新输蓝球号码：");
                } else {
                    lottery[lottery.length - 1] = blueNumber;
                    i++;
                }
            } else {
                System.out.print("请输入第" + (i + 1) + "个红球号码(1-33)：");
                int redNumber = scanner.nextInt();
                if (isExisting(lottery, redNumber)) {
                    System.out.println("红球号码重复，请重新输第" + (i + 1) + "个红球号码：");
                } else if (redNumber < 1 || redNumber > 33) {
                    System.out.println("红球号码不合法，请重新输第" + (i + 1) + "个红球号码：");
                } else {
                    lottery[i] = redNumber;
                    i++;
                }
            }
        }

        return lottery;
    }

    public static boolean isExisting(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
