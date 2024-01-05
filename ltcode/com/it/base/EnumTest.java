package com.it.base;
enum SeansonEnum{
    SPRING, SUMMER, FALL, WINTER;
}
class EnumTest {

    void judge(SeansonEnum seansonEnum){
        System.out.println(this.getClass());
        switch (seansonEnum){
            case SPRING:
                System.out.println("1");
                break;
            case SUMMER:
                System.out.println(seansonEnum.name());
        }
    }
    public static void main(String[] args) {
        System.out.println("##");
        new EnumTest().judge(SeansonEnum.SPRING);
        System.out.println(SeansonEnum.SPRING.getClass());
    }
}
