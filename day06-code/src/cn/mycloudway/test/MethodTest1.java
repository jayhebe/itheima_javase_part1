package cn.mycloudway.test;

public class MethodTest1 {
    public static void main(String[] args) {
        getRectanglePerimeter(5.2, 1.3);
    }

    public static void getRectanglePerimeter(double length, double width) {
        System.out.println("The perimeter of rectangle is " + 2 * (length + width));
    }
}
