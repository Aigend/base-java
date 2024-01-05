package com.thread;

import java.util.ArrayList;
class Demo{
    private int x;

    public int getX() {
        return x;
    }

}
class ReentrantLockDemo extends Thread{
    private Demo demo;

    @Override
    public void run() {
        add();
    }

    public void add(){
//        for(int i = 0; i<1000; i ++){
//            demo.getX() += i;
//        }
//        System.out.println(x);
    }
}
public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<ReentrantLockDemo> arrayList = new ArrayList<>(10);
        for(int j = 0; j < 10; j++){
            ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
            reentrantLockDemo.start();
            arrayList.add(reentrantLockDemo);
        }
        for(ReentrantLockDemo reentrantLockDemo: arrayList){
            reentrantLockDemo.join();
        }
    }
}
