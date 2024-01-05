package com.base.eum;


/**
 * values() 返回枚举类中所有的值。
 * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
 * valueOf()方法返回指定字符串值的枚举常量。
 */
public class EnumTest {

    enum Color {
        RED, GREEN, YELLOW;
        // 构造函数
        private Color()
        {
            System.out.println("Constructor called for : " + this.toString());
        }

        public void colorInfo()
        {
            System.out.println("Universal Color");
        }

    }
    public static void main(String[] args) {
        Color[] arr = Color.values();
        for(Color color : arr){
            System.out.println(color.name());
            System.out.println(color.ordinal()); // 查看索引 0-2
            System.out.println(Color.valueOf(color.name())); // RED
            System.out.println(Color.valueOf(color.name()) == color); // true
        }
    }
}
