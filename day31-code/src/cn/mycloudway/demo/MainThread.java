package cn.mycloudway.demo;

public class MainThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("叫我大神");
        }
    }
}
