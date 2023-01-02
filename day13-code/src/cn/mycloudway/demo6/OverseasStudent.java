package cn.mycloudway.demo6;

public class OverseasStudent extends Person {
    @Override
    public void eat() {
        System.out.println("吃披萨");
    }

    @Override
    public void drink() {
        System.out.println("喝可乐");
    }

    public void lunch() {
        eat();
        drink();
    }
}
