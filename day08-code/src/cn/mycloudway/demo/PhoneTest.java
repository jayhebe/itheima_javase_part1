package cn.mycloudway.demo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.brand = "xiaomi";
        phone.price = 1999.98;

        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.call();
        phone.playGame();
    }
}
