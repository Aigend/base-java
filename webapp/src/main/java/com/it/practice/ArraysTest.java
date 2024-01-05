package com.it.practice;
import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {
        int[] a = {1,5,6,2,4,7,9,8,0,12,17,18,20};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a, b));
        int[] c;
        c = new int[13];
        Arrays.fill(c, 1);
        System.out.println(Arrays.toString(c));
        Arrays.fill(c,0, 5, 0);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.binarySearch(a, 19));
    }
}
