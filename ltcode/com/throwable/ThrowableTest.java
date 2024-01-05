package com.throwable;

public class ThrowableTest {
    public static void main(String[] args) {
        System.out.println(f(2));
    }

    public static int f(int value) {
        try {
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }

}
