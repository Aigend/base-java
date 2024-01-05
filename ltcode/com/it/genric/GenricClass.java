package com.it.genric;

public class GenricClass <T>{
    public T test(T t){
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        new GenricClass<String>().test("Hello World");
    }
}
