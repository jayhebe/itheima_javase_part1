package cn.mycloudway.test;

public class ThreadTest1 {
    static int ticket = 1000;

    public static void main(String[] args) {
        Runnable r = () -> {
            while (true) {
                synchronized (ThreadTest1.class) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                        ticket--;
                    } else {
                        break;
                    }
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
