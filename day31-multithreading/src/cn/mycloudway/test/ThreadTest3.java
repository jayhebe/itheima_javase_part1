package cn.mycloudway.test;

public class ThreadTest3 {
    static int number = 100;

    public static void main(String[] args) {
        Runnable r = () -> {
            while (true) {
                synchronized (ThreadTest3.class) {
                    if (number == 0) {
                        break;
                    } else {
                        if (number % 2 == 1) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println(Thread.currentThread().getName() + "发现一个奇数" + number);
                        }
                        number--;
                    }
                }
            }
        };

        Thread t1 = new Thread(r, "小朋友1");
        Thread t2 = new Thread(r, "小朋友2");

        t1.start();
        t2.start();
    }
}
