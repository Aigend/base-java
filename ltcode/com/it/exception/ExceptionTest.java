package com.it.exception;

public class ExceptionTest {
    static int count = 0;

    public static void f(int i){
        System.out.println("start.......");
        try {
            System.out.println("1");
            if(i == 1)
                return;
            System.out.println("2");
            if (i == 2)
                return;
            System.out.println("3");
            if(i == 3)
                return;
            System.out.println("else");
            return;
        }finally {
            System.out.println("end");
        }
    }

    public static void main(String[] args) {
//        if(count++ == 0){
//            System.out.println("###");
//            System.out.println(count);
//        }

        // 在try或者catch块中使用了return语句，finally子句还是会执行
        for (int i = 1; i<4; i++){
            f(i);
        }

        while (true){
            try {
                if (count++ == 0){
                    throw new ThreeException();
                }
                System.out.println("no Exception");
            }catch (ThreeException e){
                System.out.println("ThreeException");
            }finally {
                System.out.println("in finally cause");
                if(count == 2)
                    break;
            }
        }
    }
}
class ThreeException extends Exception{}