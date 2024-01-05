package com.it.practice;

public interface InterfaceTest {
    public static int a = 0;
    int add(int a, int b);
    default void test(){
        System.out.println("test ...");
    }
    static void test2(){
        System.out.println("static test");
    }
}

class InterfaceTest2 implements InterfaceTest{

    @Override
    public int add(int a, int b) {
        System.out.println("interface test2 add");
        return 0;
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest2();
        System.out.println(interfaceTest.add(1, 2));
        interfaceTest.test();
//        interfaceTest.
        InterfaceTest.test2(); //通过实现类无法调用
//        InterfaceTest2.
    }
}