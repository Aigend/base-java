package com.it.collecation;

import java.util.ArrayDeque;

public class DequeTest {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        stack.addLast(3);
        stack.addLast(4);
        stack.addFirst(5);
        System.out.println(stack);
        System.out.println(stack.getFirst());
        System.out.println(stack.pop());
    }
}
