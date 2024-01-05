package com.thread;
class UncaughtExceptionTest implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName());
    }
}
class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }

    public ThreadDemo(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "变量i:" + i);
        }
        System.out.println(5/0);
    }
}

public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        System.out.println(threadGroup.getName());
        System.out.println(threadGroup.isDaemon());
        ThreadGroup tg = new ThreadGroup("new group");
        tg.setDaemon(true);
        UncaughtExceptionTest uncaughtExceptionTest = new UncaughtExceptionTest();
//        ThreadDemo.setDefaultUncaughtExceptionHandler(uncaughtExceptionTest);
        ThreadDemo t1 = new ThreadDemo(tg,"线程甲");
        ThreadDemo t2 = new ThreadDemo(tg,"线程乙");
        t1.setUncaughtExceptionHandler(uncaughtExceptionTest);
        t1.start();
        t2.start();
    }
}
