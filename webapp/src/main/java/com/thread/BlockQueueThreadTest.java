package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    private BlockingQueue<String> bq;

    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] strArr = new String[]{
                "JAVA",
                "Structs",
                "Spring"
        };
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "生产者准备生产元素");
            try {
                Thread.sleep(200);
                bq.put(strArr[i % 3]);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println(getName() + "生产完成" + bq);
        }
    }
}

class Consumer extends Thread {
    private BlockingQueue<String> bq;

    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName() + "消费者准备消费元素");
            try {
                Thread.sleep(200);
                bq.take();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println(getName() + "消费完成" + bq);
        }

    }
}

public class BlockQueueThreadTest {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        new Producer(bq).start();
//        new Producer(bq).start();
//        new Producer(bq).start();

        new Consumer(bq).start();

    }
}
