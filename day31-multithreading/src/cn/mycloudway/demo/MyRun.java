package cn.mycloudway.demo;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World:" + Thread.currentThread().getName());
        }
    }
}
