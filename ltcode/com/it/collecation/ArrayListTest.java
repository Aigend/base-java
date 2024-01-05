package com.it.collecation;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        System.out.println(list.indexOf(6));
        list.set(0, 0);
        System.out.println(list);
        System.out.println(list.subList(3, 4));
        list.replaceAll((ele)-> ele * 3);
        System.out.println(list);

//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            int a = (Integer) iterator.next();
//            System.out.println(a);
//        }

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println("***");
            System.out.println(listIterator.next());
        }
        listIterator.add(100);
        while (listIterator.hasPrevious()){
            System.out.println("###");
            int b = (Integer) listIterator.previous();
            System.out.println(b);
        }

        int[] nums = new int[]{1, 4, 5};
        List<int[]> l = Arrays.asList(nums);
        l.forEach((ele)-> System.out.println(Arrays.toString(ele)));
        System.out.println(l);
    }
}
