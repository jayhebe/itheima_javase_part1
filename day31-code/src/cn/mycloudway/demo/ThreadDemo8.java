package cn.mycloudway.demo;

public class ThreadDemo8 {
    public static void main(String[] args) {
        TicketSelling ts = new TicketSelling();

        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        Thread t3 = new Thread(ts);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
