package com.it.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callableTest = new CallableTest();
        FutureTask<String> task = new FutureTask<String>(callableTest);
        //因为futureTask实现了Runnable接口，像普通的Runnable实现类一样传入Thread就可以了
        Thread t1 = new Thread(task, "t1");
        //正常启动
        t1.start();
        //尝试获取返回结果
        System.out.println("****** result=" + task.get());
    }
}
