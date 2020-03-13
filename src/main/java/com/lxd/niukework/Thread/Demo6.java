package com.lxd.niukework.Thread;

import java.util.Random;
import java.util.concurrent.*;

public class Demo6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService threadPool = Executors.newCachedThreadPool();
//       ExecutorService threadPool = Executors.newFixedThreadPool(5);
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> result = null;
        for (int i = 0; i <20; i++) {
            result = threadPool.submit(()->{
                System.out.println(Thread.currentThread().getName());
                return new Random().nextInt(50);
            });
            System.out.println("lxd"+result.get());
        }
        threadPool.shutdown();
    }
}
