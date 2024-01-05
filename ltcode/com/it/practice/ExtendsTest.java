package com.it.practice;

public class ExtendsTest {
    static int a = 3;
    public static void test(){
        System.out.println("extend test ...");
    }
    public void add(){

    }
}

class ChildExtend extends ExtendsTest{

    public static void main(String[] args) {
        ChildExtend childExtend = new ChildExtend();
        System.out.println(ChildExtend.a);
//        System.out.println(childExtend.te); 无法通过实例调用父类的属性
    }
}

