package com.it.thread;

public class RunnableTest2 implements Runnable{

    private int num = 5;

    public void run() {
        for(int i=0;i<10;i++){
            sale();
        }
    }

    // 使用同步方法
    public synchronized void sale(){
        try {
            Thread.sleep(300);    //休息300毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(num > 0 ){
            System.out.println(Thread.currentThread().getName()+"买票"+this.num--);
        }
    }

    public static void main(String[] args){
        RunnableTest2 t3 = new RunnableTest2();

        new Thread(t3,"售票窗口1").start();
        new Thread(t3,"售票窗口2").start();
        new Thread(t3,"售票窗口3").start();
    }
}
