package com.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
//        File file = new File("/Users/wenlong.jin/Desktop/code/java_code/code/ltcode/file.txt");
//        System.out.println(file);
        System.out.println("##");
        try
        {
            // 创建Properties类对象
            Properties properties = new Properties();

            // 读取properties属性文件到输入流中
            InputStream is = PropertiesTest.class.getResourceAsStream("/my.properties");

            // 从输入流中加载属性列表
            properties.load(is);

            // 获取properties文件中的属性值
            String userName = properties.getProperty("userName");
            String blogUrl = properties.getProperty("blogUrl");

            // 输出结果
            System.out.println("用户名称：" + userName);
            System.out.println("博客地址：" + blogUrl);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
