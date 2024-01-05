package com.stream;

@FunctionalInterface
interface BinaryOperator<T> {
    // Bi操作：两个输入，一个输出
    T apply(T t, T u);
}

public class StreamTest {
    public static void main(String[] args) {
    }
}
