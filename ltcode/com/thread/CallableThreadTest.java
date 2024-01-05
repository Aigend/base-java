package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int age = 0;
        while (age < 100){
            age ++;
            System.out.println(Thread.currentThread().getName() + age);
        }
        System.out.println("end ...");
        return age;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThreadTest callableThreadTest = new CallableThreadTest();
        FutureTask<Integer> task = new FutureTask<>(callableThreadTest);
        Thread th = new Thread(task);
        th.start();
        System.out.println(task.isDone());
        System.out.println(task.get());
        System.out.println(task.isDone());
        System.out.println(task.isCancelled());
    }
}
