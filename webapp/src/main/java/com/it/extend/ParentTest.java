package com.it.extend;

public class ParentTest {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        ParentTest.address = address;
    }

    public static String address;

    public ParentTest() {
        System.out.println("parent constructor function ...");
    }

    public ParentTest(String name, int age) {
        System.out.println("parent param function ......");
        this.name = name;
        this.age = age;
    }

    public void test(){
        System.out.println("parent test function ......");
    }

}

