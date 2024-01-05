package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class ErrorUtils {
    public static void faultyMethod(List<String>... listStrArray){
        List[] listArray = listStrArray;
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        listArray[0] = myList;
        String s= (String) listArray[0].get(0);
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        ErrorUtils.faultyMethod(list1, list2);
    }
}
