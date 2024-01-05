package com.it.thread;

public class RunnableTest implements Runnable{
    private int countDown = 10;
    @Override
    public void run() {
        System.out.println("Runnable test ...");
//        while(countDown-- >0) // 这里是先拿countDown的值进行判断，再进行减操作
//        {
//            System.out.println("$" + Thread.currentThread().getName()
//                    + "(" + countDown + ")");
//        }
        while(++countDown <20) // 这里是先拿countDown的值进行加操作，再进行判断
        {
            System.out.println("$" + Thread.currentThread().getName()
                    + "(" + countDown + ")");
        }
    }
}


