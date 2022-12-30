package cn.mycloudway.test;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < phones.length; i++) {
            System.out.println("Please enter the information for the " + (i + 1) + " phone: ");
            Phone phone = new Phone();

            System.out.print("Please enter the brand of the phone: ");
            String brand = scanner.next();
            phone.setBrand(brand);

            System.out.print("Please enter the price of the phone: ");
            double price = scanner.nextDouble();
            phone.setPrice(price);

            System.out.print("Please enter the color of the phone: ");
            String color = scanner.next();
            phone.setColor(color);

            phones[i] = phone;
        }

        double sum = 0.0;
        for (int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }
        System.out.println("The mean price is " + (sum / phones.length));
    }
}
