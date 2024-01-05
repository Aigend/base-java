package com.it.base;

public class SwitchTest {
    public static void main(String[] args) {
        String s = new String("a");
        // switch 语句
        char score = 'C';
        switch (score){
            case 'A':
                System.out.println("A");
            case 'B':
                System.out.println("B");
            case 'C':
                System.out.println("C");
            default:
                System.out.println("##");
        }
        int a= 10;
        while (a>0){
            System.out.println("a>>"+a);
            a -= 1;
        }


    }
}
