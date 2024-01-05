package com.itheima.base;

public class ExtendTest {
    public String name;
    public int age;
    public String tag = "#####";

    ExtendTest(){
        System.out.println("ExtendTest ...");
    }
    ExtendTest(String name, int age){
        System.out.println("...");
        this.name = name;
        this.age = age;
    }
    public void test(){
        System.out.println("test...");
    }
}


class SonExtendTest extends ExtendTest{

    public String name;
    public int age;
    public String tag = "****";


    public SonExtendTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void test() {
        System.out.println("..... son test");
    }

    public static void main(String[] args) {
        SonExtendTest extendTest = new SonExtendTest("ajd", 24);
        ((ExtendTest)extendTest).test();
    }
}