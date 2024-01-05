package com.collecation.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);

        System.out.println(Sites.get(1));

        System.out.println(Sites.size());

        Set<Integer> set = Sites.keySet();
        System.out.println(set);

        System.out.println("&&");
        System.out.println(Sites.values().getClass());
        System.out.println(Sites.values());
        Collection<String> strings = Sites.values();
        System.out.println(strings);

        System.out.println(Sites.containsKey(4));
        System.out.println(Sites.containsKey(5));

        System.out.println(Sites.remove(4));
        Sites.put(4, "AAAAA");
        System.out.println(Sites.remove(4, "AAAA"));
        System.out.println(Sites.remove(4, "AAAAA"));

        // entrySet()返回了 HashMap 中所有映射项的一个 set 集合视图
        // for-each loop 在该视图中访问了每一映射项
        for(Map.Entry<Integer, String> entry: Sites.entrySet()) {
            System.out.print(entry);
            System.out.print(": ");
            System.out.print(entry.getKey());
            entry.setValue("####");
            System.out.print("->");
            System.out.print(entry.getValue());
            System.out.print("; ");
        }
        System.out.println(Sites);

        System.out.println(Sites.containsValue("AAAA"));
        Sites.put(6, "Google");
        System.out.println(Sites.containsValue("Google"));



        Sites.clear();
        System.out.println(Sites);
    }
}
