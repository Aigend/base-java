package com.it.thread;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("CallableTest run ......");
        return "Hello World";
    }
}
