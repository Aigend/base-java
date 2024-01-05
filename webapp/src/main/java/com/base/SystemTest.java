package com.base;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws IOException {
        int[] a = new int[]{1, 4, 5, 7};
        System.out.println(Arrays.toString(a));
        int[] b = new int[4];
        System.arraycopy(a, 0, b, 0, 3);
        System.out.println(Arrays.toString(b));

        for(int i=0;i<a.length;i++){
            a[i] = a[i] * 5;
        }
        System.out.println(Arrays.toString(a));

        for(int num: a){
            System.out.println(num);
        }

        Map<String, String> env = System.getenv();
        for (String name:env.keySet()) {
            System.out.println(name + "---->>>" + env.get(name));
        }

        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("HOME"));

        Properties props = System.getProperties();
        props.store(new FileOutputStream("props.txt"), "system properities");

        System.out.println(System.getProperty("os.name")); // Mac OS X

        System.out.println(System.identityHashCode(props));

        System.out.println(System.currentTimeMillis());//1695454186185

    }
}
