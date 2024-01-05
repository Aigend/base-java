package com.base;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println("0.05+0.01=" + (0.05 + 0.01));
        System.out.println("0.05+0.03=" + (0.05 + 0.03));

        BigDecimal bigDecimal = new BigDecimal("0.05");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.01);
        BigDecimal bigDecimal2 = new BigDecimal(0.03);//不要使用这种类型数据
    }
}
