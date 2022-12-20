package cn.mycloudway.test;

public class TwoDimensionsArrayTest1 {
    public static void main(String[] args) {
        int[][] revenueByQuarter = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int revenueByYear = 0;
        for (int i = 0; i < revenueByQuarter.length; i++) {
            int sum = 0;
            for (int j = 0; j < revenueByQuarter[i].length; j++) {
                sum += revenueByQuarter[i][j];
            }
            revenueByYear += sum;
            System.out.println("第" + (i + 1) + "季度营业额为" + sum);
        }
        System.out.println("全年营业额为" + revenueByYear);
    }
}
