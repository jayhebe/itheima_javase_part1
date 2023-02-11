package cn.mycloudway.demo;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueFoodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public QueueFoodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
