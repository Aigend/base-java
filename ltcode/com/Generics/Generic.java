package com.Generics;

public class Generic<T extends Number>{
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey(){
        return key;
    }
}


class GenericTest{

    public static void main(String[] args) {
        Generic<?>[] generic = new Generic[10];

    }
}