package com.base.cls;

class Father {
    public String name;
    public int age;
    public Father(){

    }
    public Father(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void test(){

    }

}

public class ExtendTest extends Father{

    public ExtendTest(){
    }

    public ExtendTest(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 2, 3, 8, 5, 7, 9, 0};
        String[] str = new String[]{"abc", "decfs", "adham"};

    }
}
