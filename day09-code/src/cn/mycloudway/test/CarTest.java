package cn.mycloudway.test;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Please enter the information for the " + (i + 1) + " car: ");
            Car car = new Car();

            System.out.print("Please enter the brand of the car: ");
            String brand = scanner.next();
            car.setBrand(brand);

            System.out.print("Please enter the price of the car: ");
            double price = scanner.nextDouble();
            car.setPrice(price);

            System.out.print("Please enter the color of the car: ");
            String color = scanner.next();
            car.setColor(color);

            cars[i] = car;
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand() + ", " + cars[i].getPrice() + ", " + cars[i].getColor());
        }
    }
}
