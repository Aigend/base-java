package com.base;

public class MathTest {
    public static void main(String[] args) {

        System.out.println("小于目标数的最大整数：" + Math.floor(-1.2));//-2
        System.out.println("大于目标数的最大整数：" + Math.ceil(-1.2));//-1

        System.out.println("四舍五入整数：" + Math.round(-1.2));

        System.out.println("平方根：" + Math.sqrt(4));

        System.out.println("立方根：" + Math.cbrt(9));

        System.out.println("乘方：" + Math.pow(3, 4));

        System.out.println("大于等于0.0，小于1.0的伪随机数：" + Math.random());
    }
}
