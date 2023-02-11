package cn.mycloudway.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCall mc = new MyCall();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();
        System.out.println(ft.get());
    }
}
