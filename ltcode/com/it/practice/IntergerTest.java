package com.it.practice;

public class IntergerTest {
    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }
    public static void main(String[] args) {
        Number number = 3;
        int i = 1;
        Double d = (double) i;
        System.out.println(d);
    }
}
