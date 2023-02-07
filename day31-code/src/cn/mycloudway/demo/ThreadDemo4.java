package cn.mycloudway.demo;

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2("飞机");
        MyThread2 mt2 = new MyThread2("大炮");

        mt1.setPriority(1);
        mt2.setPriority(10);

        mt1.start();
        mt2.start();

//        System.out.println(mt1.getPriority());
//        System.out.println(mt2.getPriority());
    }
}
