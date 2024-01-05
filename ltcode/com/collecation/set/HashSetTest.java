package com.collecation.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 2, 3, 8, 5, 7, 9, 0};
        String[] str = new String[]{"abc", "decfs", "adham"};

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("asd");
        hashSet.add("aksdj");
        hashSet.add("sdjkhf");
        hashSet.add("skjdhfwe");
        System.out.println(hashSet);

        System.out.println(hashSet.contains("asd"));

        System.out.println(hashSet.remove("adfasdaldf"));

        System.out.println(hashSet.size());

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<String> sites = new HashSet<String>();
        sites.add("asd");
        sites.add("Runoob");
//        sites.add("Taobao");
//        sites.add("Zhihu");
//        System.out.println(sites.add("Runoob"));     // 重复的元素不会被添加
//        sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false

        System.out.println("******");
        System.out.println(hashSet.containsAll(sites));

        System.out.println(hashSet.removeAll(sites));
        System.out.println(hashSet);

//        System.out.println(hashSet.retainAll(sites));
    }
}
