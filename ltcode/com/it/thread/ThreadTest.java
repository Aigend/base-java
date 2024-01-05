package com.it.thread;

public class ThreadTest extends Thread{
//    public void run()  {
//        try {
//            Thread.sleep(50000);  // 延迟50秒
//        }
//        catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().isInterrupted());
//            System.out.println(e.getMessage());
//            System.out.println(Thread.currentThread().isInterrupted());
//        }
//    }

    public void run() {
        while (!isInterrupted()) { //非阻塞过程中通过判断中断标志来退出
            try {
                Thread.sleep(5*1000);//阻塞过程捕获中断异常来退出
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;//捕获到异常之后，执行 break 跳出循环
            }
        }
    }
    public static void main(String[] args) throws Exception  {
        Thread thread = new ThreadTest();
        thread.start();
        System.out.println("在50秒之内按任意键中断线程!");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出!");
    }
}
