package com.base;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 5, 7};
        System.out.println(Arrays.toString(a));
        int[] b = new int[4];
        System.arraycopy(a, 0, b, 0, 3);
        System.out.println(Arrays.toString(b));

        for(int i=0;i<a.length;i++){
            a[i] = a[i] * 5;
        }
        System.out.println(Arrays.toString(a));

        for(int num: a){
            System.out.println(num);
        }
    }
}
