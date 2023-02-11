package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneralTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("请输入一个1-100之间的整数：");
            int number = Integer.parseInt(scanner.nextLine());
            intArr.add(number);
            if (getSum(intArr) > 200) {
                flag = false;
                System.out.println(getSum(intArr));
            }
        }
    }

    public static int getSum(ArrayList<Integer> intArr) {
        int sum = 0;
        for (int i : intArr) {
            sum += i;
        }

        return sum;
    }
}
