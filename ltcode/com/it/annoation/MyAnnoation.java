package com.it.annoation;

import java.lang.annotation.*;

public @interface MyAnnoation {
}

@interface MyAnnoation2{

}

@Target(value = {ElementType.TYPE, ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface MyInherited{
    String [] values();
    int number();
}

// 重复注解
@Repeatable(Authorities.class)
@interface Authority {
    String role();
}

@interface Authorities {
    Authority[] value();
}

class RepeatAnnotationUseNewVersion {
    @Authority(role="Admin")
    @Authority(role="Manager")
    public void doSomeThing(){ }
}