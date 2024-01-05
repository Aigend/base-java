package com.it.base;

public class BaseTest {
    private static int size;
    private static int test(int[] nums){
        return nums.length;
    }
    public static void main(String[] args) {
        int[] a= new int[3];
        int[] b= new int[2];
        int c = test(a);
        int d = test(b);
        if ((size = a.length) != 3) {
            return;
        }
        System.out.println("###");
        int e = a.length != 0 ? a.length:b.length;
        System.out.println(e);
    }
}
