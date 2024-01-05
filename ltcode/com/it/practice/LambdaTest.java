package com.it.practice;

import java.util.Collection;
import java.util.HashSet;

public class LambdaTest {
    public static void main(String[] args) {
        Collection<String> collection = new HashSet<String>();
        collection.add("book");
        collection.forEach(System.out::println);
    }
}
