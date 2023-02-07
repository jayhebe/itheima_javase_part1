package cn.mycloudway.demo;

public class ThreadDemo5 {
    public static void main(String[] args) {
        MainThread mt = new MainThread();
        DaemonThread dt = new DaemonThread();

        dt.setDaemon(true);

        mt.start();
        dt.start();
    }
}
