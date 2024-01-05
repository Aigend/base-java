package com.base.string;

import java.util.Arrays;

public class StringBuildTest {
    public static void main(String[] args) {
        String s = "asd,askf,afae,vs";
        StringBuilder stringBuilder = new StringBuilder(s);

        System.out.println(stringBuilder.length());//16

        System.out.println(stringBuilder.capacity());//32

        char[] chars = new char[7];
        stringBuilder.getChars(0, 5, chars, 1);
        System.out.println(Arrays.toString(chars));

        stringBuilder.setCharAt(0, 'A');
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.charAt(0));

        System.out.println(stringBuilder.reverse());

        stringBuilder.append("###");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.insert(1, "@@"));

        System.out.println(stringBuilder.delete(0, 1));

        stringBuilder.replace(0, 2, "$$");
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(2);
        System.out.println(stringBuilder);

        //返回新串，原来的串不变
        System.out.println(stringBuilder.substring(3));
        System.out.println(stringBuilder);

    }
}
