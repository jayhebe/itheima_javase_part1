package cn.mycloudway.demo;

public class Ticket extends Thread {
    static int ticket = 0;
    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
