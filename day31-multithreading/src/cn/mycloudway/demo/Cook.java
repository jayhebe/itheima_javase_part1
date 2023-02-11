package cn.mycloudway.demo;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Desk.foodFlag = 1;
                        System.out.println("厨师做了一碗面条");
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
