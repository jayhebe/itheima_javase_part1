package cn.mycloudway.test;

public class MethodTest3 {
    public static void main(String[] args) {
        double area1 = getRectanglePerimeter(1.5, 2.4);
        double area2 = getRectanglePerimeter(2.5, 3.4);

        if (area1 > area2) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }
    }

    public static double getRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
