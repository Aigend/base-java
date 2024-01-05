package com.base;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 5, 7};
        System.out.println(Arrays.toString(a));
        System.out.println("**");
        Arrays.sort(a, 2, 4);
        Arrays.sort(a);

        int[] b = new int[a.length];
        Arrays.fill(b, 1);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.binarySearch(a, 4));

        System.out.println(Arrays.binarySearch(a, 1, 4, 4));

        int[] c = Arrays.copyOf(a, 3);
        System.out.println(Arrays.toString(c));

        System.arraycopy(a, 0, b, 0, 2);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(a));
        Arrays.parallelPrefix(a, ((left, right) -> {
            System.out.println(left + "->" + right);
            return left+right;
        }));
        System.out.println(Arrays.toString(a));

//        int[] d = new int[1];
//        Arrays.parallelPrefix(d, (Integer::sum));
//        System.out.println(Arrays.toString(d));

        int[] e = new int[1];
        e[0] = 5;
        System.out.println(Arrays.toString(e));
        Arrays.parallelPrefix(e, ((left, right) -> {
            System.out.println(left + "<->" + right);
            return left+right;
        }));
        System.out.println(Arrays.toString(e));

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        Arrays.parallelSetAll(cars, String::valueOf);
        System.out.println(Arrays.toString(cars));

//        String[] strNums = new String[5];
//        ArrayList<String> str = (ArrayList<String>) Arrays.<String>asList("##", "**", "$$");

//        Arrays.binarySearch();
//        Arrays.binarySearch();
//
//        Arrays.copyOf();
//        Arrays.copyOfRange();
//        Arrays.equals();
//        Arrays.fill();
//        Arrays.fill();
//        Arrays.sort();
//        Arrays.sort();
//
//        Arrays.parallelPrefix();
//        Arrays.parallelPrefix();
//        Arrays.parallelSetAll();
//
//        Arrays.parallelSort();
//        Arrays.parallelSort();
//
//        Arrays.stream();
//        Arrays.sort();

    }

}
