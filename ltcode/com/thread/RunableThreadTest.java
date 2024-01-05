package com.thread;

public class RunableThreadTest implements Runnable {
    private int sum;
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            sum += 1;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws InterruptedException {
        RunableThreadTest runableThreadTest = new RunableThreadTest();
        Thread th = new Thread(runableThreadTest);
        Thread ts = new Thread(runableThreadTest);
        th.setDaemon(true);
        ts.setDaemon(true);
        th.start();
        ts.start();
        th.join();
        ts.join();
        System.out.println(Thread.currentThread().getName() + " end ...");
    }
}
