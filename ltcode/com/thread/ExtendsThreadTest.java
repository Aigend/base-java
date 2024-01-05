package com.thread;

public class ExtendsThreadTest extends Thread{

    private int age;

    @Override
    public void run() {
        while (age < 10){
            age ++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + age);
        }
        System.out.println("end ...");
    }

    public static void main(String[] args) {
        ExtendsThreadTest extendsThreadTest = new ExtendsThreadTest();
        extendsThreadTest.setName("extendsThread");
        extendsThreadTest.start();
    }
}
