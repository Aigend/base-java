package com.collecation.list;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(5);
        for(int i : list){
            System.out.println(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> list2 = new ArrayList<>(5);
        list2.add("abc");
        list2.add("bcd");
        list2.add("cde");
        list2.set(2, "efg");
        System.out.println(list2.size());
        System.out.println(list2.get(1));

        Collections.sort(list2);
        System.out.println(list2);

        String[] st = new String[list2.size()];
        list2.toArray(st);
        System.out.println(Arrays.toString(st));



    }
}
