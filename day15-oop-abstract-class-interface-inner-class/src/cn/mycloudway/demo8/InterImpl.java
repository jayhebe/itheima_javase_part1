package cn.mycloudway.demo8;

public class InterImpl implements Inter1, Inter2 {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
