package cn.mycloudway.demo;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Desk.count--;
                        System.out.println("吃货在吃面条，还能再吃" + Desk.count + "碗");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
