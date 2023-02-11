package cn.mycloudway.demo;

public class MyThread2 extends Thread {

    public MyThread2() {

    }

    public MyThread2(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("I am " + getName());
        }
    }
}
