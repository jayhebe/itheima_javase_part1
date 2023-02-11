package cn.mycloudway.test;

public class WhileTest1 {
    public static void main(String[] args) {
        double heightOfEverest = 8844430;
        double heightOfPaper = 0.1;
        int count = 0;

        while (heightOfPaper < heightOfEverest) {
            heightOfPaper *= 2;
            count += 1;
        }

        System.out.println("The final count is " + count);
    }
}
