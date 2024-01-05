package com.it.base;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        System.out.println("444" + true);
        System.out.println("字符串可以和bool一起" + (5>4));

        byte a = -3;
        System.out.println(Byte.toUnsignedInt(a));
        System.out.println(Integer.parseInt("ab", 16));
//        System.out.println(Integer.parseInt("sh", 16));
    }
}
