package com.it.arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        int[] a = new int[]{1, 5, 2, 6, 4, 3, 9, 8, 7};
        int[] b;
        int[] c = new int[a.length];
        int[] d = Arrays.copyOf(a, a.length); //把a copy一份给b
        System.out.println(Arrays.toString(d));
        System.arraycopy(a, 0, c, 0, a.length);
        System.out.println(Arrays.toString(c));
        int[] e = new int[a.length];
        Arrays.fill(e, 100);
        System.out.println(Arrays.toString(e));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(c, 2, c.length); // 后一个索引要取到length，才能取到最后一个元素
        System.out.println(Arrays.toString(c));

        Arrays.parallelPrefix(a, (left, right) -> left * right);


//        int[] nums = {1, 2};
//        int[] newNums = new int[]{1, 2};
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(newNums));
//        @SuppressWarnings({"unchecked"}) int[] newNums2 = new int[2];
//        System.out.println(Arrays.toString(newNums2));
//        for(int num: nums){
//            System.out.println(num);
//            System.out.println(String.valueOf(num));
//            String n = String.valueOf(num);
//            System.out.println(n);
//        }
//        int[] a = new int[5];
//        Arrays.fill(a, 1);
//        a[1] = 3;
//        System.out.println(Arrays.toString(a));
//        int[] b = Arrays.copyOf(a, a.length);
//        System.out.println(Arrays.toString(b));
//        int[] c = new int[10];
//        System.arraycopy(a, 1, c, 2, 5);
//        System.out.println(Arrays.toString(c));

//        int[] nums = new int[6];
//        System.out.println(nums.getClass().isInstance(new int[5]));
//        nums[nums.length -1 ] = 5;
//        Arrays.sort(nums);
//        System.out.println(Arrays.binarySearch(nums, 5));

    }
}
