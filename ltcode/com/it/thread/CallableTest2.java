package com.it.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest2 {
    public static void main(String[] args) {
        //因为Callable接口是函数式接口，可以使用Lambda表达式
        FutureTask<String> task = new FutureTask<String>((Callable<String>)()->{
            System.out.println("FutureTask and Callable");
            return "hello word";
        });
        Thread t1 = new Thread(task, "t1");
        //正常启动
        t1.start();
        try{
            //尝试获取返回结果
            System.out.println("子线程返回值 ： " + task.get());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

