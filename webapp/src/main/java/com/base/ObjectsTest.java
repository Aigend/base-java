package com.base;

import java.util.Objects;

public class ObjectsTest {
    static ObjectTest obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj)); //0
        System.out.println(Objects.toString(obj));//null
        System.out.println(Objects.requireNonNull(obj, "参数不能为null"));//java.lang.NullPointerException
    }
}
