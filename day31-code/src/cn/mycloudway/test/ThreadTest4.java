package cn.mycloudway.test;

import java.util.Random;

public class ThreadTest4 {
    static int money = 100;
    static int times = 3;
    static int sum = 0;

    public static void main(String[] args) {
        Runnable r = () -> {
          synchronized (ThreadTest4.class) {
              if (times == 0) {
                  System.out.println(Thread.currentThread().getName() + "没有抢到红包");
              } else {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
                  if (times != 1) {
                      Random random = new Random();
                      int red = random.nextInt(50);
                      System.out.println(Thread.currentThread().getName() + "抢到了红包" + red + "元");
                      sum += red;
                  } else {
                      System.out.println(Thread.currentThread().getName() + "抢到了红包" + (money - sum) + "元");
                  }
                  times--;
              }
          }
        };

        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");
        Thread t3 = new Thread(r, "线程3");
        Thread t4 = new Thread(r, "线程4");
        Thread t5 = new Thread(r, "线程5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
