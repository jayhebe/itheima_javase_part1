package cn.mycloudway.demo;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我就是陪着");
        }
    }
}
