package com.it.base;

public class ExtendsTest {
    public void test(int a){
        System.out.println("Extend Test ...");
    }
}

class ExtendTest2 extends ExtendsTest{

    public void test(String a) {
        //方法重载
        System.out.println(a);
    }

    public static void main(String[] args) {
        new ExtendTest2().test("##");
        new ExtendTest2().test(1);
    }
}
