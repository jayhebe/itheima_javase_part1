package cn.mycloudway.demo;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo10 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        QueueCook cook = new QueueCook(queue);
        QueueFoodie foodie = new QueueFoodie(queue);

        cook.start();
        foodie.start();
    }
}
