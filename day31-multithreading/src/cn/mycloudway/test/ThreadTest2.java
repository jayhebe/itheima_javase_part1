package cn.mycloudway.test;

public class ThreadTest2 {
    static int gift = 100;

    public static void main(String[] args) {
        Runnable r = () -> {
            while (true) {
                synchronized (ThreadTest2.class) {
                    if (gift < 10) {
                        break;
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + "正在派送礼物" + gift);
                        gift--;
                    }
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.setName("派送员1");
        t2.setName("派送员2");

        t1.start();
        t2.start();
    }
}
