package com.it.annoation;
import java.lang.annotation.*;
@MyInherited(values = {"zhangsan"}, number = 15)
public class MyInheritedTest {
}

class MyInheritedTest2 extends MyInheritedTest{
    public static void main(String[] args) {
        Class clazz = MyInheritedTest2.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }
    }
}
