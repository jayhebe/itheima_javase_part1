package cn.mycloudway.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(new ThreadPoolRun());
        service.submit(new ThreadPoolRun());
        service.submit(new ThreadPoolRun());
        service.submit(new ThreadPoolRun());
        service.submit(new ThreadPoolRun());
        service.submit(new ThreadPoolRun());

        service.shutdown();
    }
}
