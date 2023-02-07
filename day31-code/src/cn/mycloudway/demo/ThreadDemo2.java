package cn.mycloudway.demo;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.start();
        t2.start();
    }
}
