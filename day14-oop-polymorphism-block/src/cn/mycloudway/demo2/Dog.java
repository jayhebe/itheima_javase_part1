package cn.mycloudway.demo2;

public class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("dog show");
    }

    public void lookHome() {
        System.out.println("look home");
    }
}
