package com.thread;

public class YieldThreadTest extends Thread {
    public YieldThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i);
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldThreadTest ctrlThreadTest1 = new YieldThreadTest("high");
        ctrlThreadTest1.setPriority(Thread.MAX_PRIORITY);
        ctrlThreadTest1.start();
        YieldThreadTest ctrlThreadTest2 = new YieldThreadTest("low");
        ctrlThreadTest2.setPriority(Thread.MIN_PRIORITY);
        ctrlThreadTest2.start();
    }
}
