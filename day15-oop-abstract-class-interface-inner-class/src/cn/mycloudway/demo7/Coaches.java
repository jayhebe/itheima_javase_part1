package cn.mycloudway.demo7;

public abstract class Coaches extends Person {
    public Coaches() {
    }

    public Coaches(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
