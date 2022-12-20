package cn.mycloudway.test;

public class MethodTest2 {
    public static void main(String[] args) {
        getCircleArea(1.5);
    }

    public static void getCircleArea(double radius) {
        System.out.println("The area of circle is " + Math.PI * radius * radius);
    }
}
