package com.base.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int[] nums = new int[]{1, 4, 2, 3, 8, 5, 7, 9, 0};
        String[] str = new String[]{"abc", "decfs", "adham"};
        System.out.println("##".concat("@@"));

        char[] chars = new char[]{'a', 'e', 'f'};
        String t = new String(chars);
        System.out.println(t);

        char[] chars1 = new char[]{65, 66, 67};
        System.out.println(new String(chars1));

        String s = "abc";
        String q = s.concat("666");
        System.out.println(q);
        System.out.println(q.startsWith("a"));
        System.out.println(q.endsWith("666"));

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        for(byte bt:bytes){
            System.out.println(bt);
        }

        System.out.println(s.toUpperCase());

        System.out.println(s.toUpperCase().toLowerCase());

        System.out.println("  Sd f  ".trim());

        System.out.println("sdmnfsdf".toCharArray());
        for(char ch : "sad".toCharArray()){
            System.out.println(ch);
        }
        System.out.println("abc".compareToIgnoreCase("ABc"));

        System.out.println("abc".compareTo("ABC"));

        System.out.println("sdf".charAt(1));
        System.out.println('a');//a
        System.out.println('a' == 97);//true

        System.out.println(s.contains("a"));
//        System.out.println(s.getBytes("utf-8").toString());

        System.out.println(Integer.valueOf("97"));

    }
}
