package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class ErasureTest2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(9);
//        list.add(6);
//        List li = list;
//        List<String> ll = li;
//        System.out.println(ll.get(0));

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(6);
        List li = list;
        List<Number> ll = li;
        System.out.println(ll.get(0));
    }
}
