package cn.mycloudway.demo2;

public class Cat extends Animal {
    @Override
    public void show() {
        System.out.println("cat show");
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}
