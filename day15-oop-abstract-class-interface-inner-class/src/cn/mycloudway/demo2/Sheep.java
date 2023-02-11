package cn.mycloudway.demo2;

public class Sheep extends Animal {
    public Sheep() {
        System.out.println("Sheep Constructor");
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃草");
    }
}
