package com.it.thread;

public class TestRunnable {
    public static void main(String[] args) throws InterruptedException {
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        thread.start();
        thread.join();
        System.out.println("main thread run end...");
    }
}
